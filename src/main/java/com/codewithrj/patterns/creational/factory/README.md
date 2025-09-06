# Factory Method Design Pattern (Transport / Logistics Example)

## Intent
Define an interface for creating an object, but let subclasses decide **which class to instantiate**.  
The Factory Method Pattern allows a class to **delegate the instantiation of objects** to subclasses, promoting loose coupling and extensibility.

---

## Problem
If object creation is handled directly in client code:

- Clients are tightly coupled to concrete classes (`Truck`, `Ship`).
- Adding new products requires modifying client logic (`if-else` or `switch`).
- Violates the **Open/Closed Principle** — code should be open for extension but closed for modification.

---

## Real-World Analogy
Think of a **logistics company**:

- RoadLogistics → provides **Truck**.
- SeaLogistics → provides **Ship**.
- The client (business) only asks for logistics; it **doesn’t care** whether the delivery is by truck or ship.
- Object creation is handled by the factory (subclass of Logistics).

---

## Implementations in this Repo

### 1. Transport Interface
- Defines the **product behavior** (`deliver()`).

### 2. Concrete Products
- `Truck` → delivers by land.
- `Ship` → delivers by sea.

### 3. Logistics (Abstract Class / Interface)
- Declares the **factory method**: `createTransport()`.
- Provides **business logic**: `planDelivery()` that uses the factory method to execute delivery.

### 4. Concrete Creators
- `RoadLogistics` → implements `createTransport()` to return a `Truck`.
- `SeaLogistics` → implements `createTransport()` to return a `Ship`.

---

## Business Logic Example
- Client code calls `planDelivery()`:
  - RoadLogistics → `Truck.deliver()`
  - SeaLogistics → `Ship.deliver()`
- The client **never instantiates `Truck` or `Ship` directly**.
- Supports **extensibility**: adding `AirLogistics` with `Plane` is easy, no changes to existing client code.

---

## Comparison (Factory vs Direct Instantiation)

| Aspect                  | Without Factory                     | With Factory Method               |
|-------------------------|------------------------------------|----------------------------------|
| Object Creation         | Done in client with `new`          | Encapsulated in factory          |
| Coupling                | High (client knows all classes)    | Low (client knows only abstract) |
| Adding New Product      | Modify client code                 | Add a new concrete factory       |
| Code Readability        | Cluttered with if-else or switch  | Clean and extensible             |
| Reusability             | Low                                | High                             |

---

## Usage
Run `FactoryApplication.java` to see:

```text
Delivered through Truck
Delivered through Ship
```

---
## Key Takeaways
- Factory Method centralizes object creation.
- Removes `if-else` clutter in client code.
- Promotes **Open/Closed Principle**: extend by adding new factories instead of modifying existing code.
- Frequently used in frameworks and libraries where users can plug in custom implementations.
