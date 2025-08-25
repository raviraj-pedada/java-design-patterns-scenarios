package com.codewithrj.patterns.creational.prototype;

public class RecordPrototypeDeepCopy implements Cloneable{
    private String title;
    private Author author;

    public RecordPrototypeDeepCopy(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public RecordPrototypeDeepCopy clone() {
        try {
            RecordPrototypeDeepCopy recordPrototypeDeepCopy = (RecordPrototypeDeepCopy) super.clone();
            recordPrototypeDeepCopy.author = new Author(this.author.getName());
            return recordPrototypeDeepCopy;
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
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
        return "RecordPrototypeDeepCopy{" +
                "title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
