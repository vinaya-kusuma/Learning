package com.Assignment2b;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.out.println("Price must be > 0");
        }
        else {
            this.price = price;
        }

    }







}
