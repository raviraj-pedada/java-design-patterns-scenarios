package com.codewithrj.patterns.creational.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    void roadLogisticsShouldReturnTruck() {
        Logistics roadLogistics = new RoadLogistics();
        Transport transport = roadLogistics.createTransport();

        assertNotNull(transport);
        assertTrue(transport instanceof Truck, "Expected instance of Truck");
    }

    @Test
    void seaLogisticsShouldReturnShip() {
        Logistics seaLogistics = new SeaLogistics();
        Transport transport = seaLogistics.createTransport();

        assertNotNull(transport);
        assertTrue(transport instanceof Ship, "Expected instance of Ship");
    }

    @Test
    void roadLogisticsPlanDeliveryShouldPrintTruckMessage() {
        Logistics roadLogistics = new RoadLogistics();

        // Capture system output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        roadLogistics.planDelivery();

        String expectedOutput = "Delivered through Truck";
        assertTrue(outContent.toString().trim().contains(expectedOutput),
                "planDelivery() should print 'Delivered through Truck'");
    }

    @Test
    void seaLogisticsPlanDeliveryShouldPrintShipMessage() {
        Logistics seaLogistics = new SeaLogistics();

        // Capture system output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        seaLogistics.planDelivery();

        String expectedOutput = "Delivered through Ship";
        assertTrue(outContent.toString().trim().contains(expectedOutput),
                "planDelivery() should print 'Delivered through Ship'");
    }
}

