package com.codewithrj.patterns.creational.prototype;

public class RecordPrototypeShallowCopy implements Cloneable{
    private String title;
    private Author author;

    public RecordPrototypeShallowCopy(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public RecordPrototypeShallowCopy clone(){
        try{
           return (RecordPrototypeShallowCopy) super.clone();
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
        return "RecordPrototypeShallowCopy{" +
                "title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
