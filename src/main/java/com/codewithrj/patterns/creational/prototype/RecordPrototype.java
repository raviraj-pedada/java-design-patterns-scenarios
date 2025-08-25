package com.codewithrj.patterns.creational.prototype;

public class RecordPrototype implements Prototype<RecordPrototype>{
    private String title;
    private Author author;

    public RecordPrototype(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public RecordPrototype(RecordPrototype recordPrototype){
        this.title = recordPrototype.getTitle();
        this.author = recordPrototype.getAuthor();
    }

    @Override
    public RecordPrototype copy() {
        return new RecordPrototype(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "RecordPrototype{" +
                "title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
