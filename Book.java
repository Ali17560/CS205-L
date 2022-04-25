package edu.monmouth.hw6;
public class Book implements Comparable<Book> {
    private int numberOfPages;
    private double price;
    private String title;
    private BookTypes bookType;

    public Book(int numberOfPages, double price, String title, BookTypes bookType) {
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.title = title;
        this.bookType = bookType;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookTypes getBookType() {
        return bookType;
    }

    public void setBookType(BookTypes bookType) {
        this.bookType = bookType;
    }
    @Override
    public boolean equals(Object o) {
    System.out.println("In Book equals...");
    if (o == null) {
    return false;
    }
    if (!(o instanceof Book)) {
    return false;
    }
    if (o == this) {
    return true;
    }
    Book otherBook = (Book)o;
    return otherBook.numberOfPages==numberOfPages && otherBook.price==price &&otherBook.bookType==bookType &&otherBook.title.equals(title);
    }
    @Override
    public int compareTo(Book otherBook) {
    final int BEFORE = -1;
    final int EQUAL = 0;
    final int AFTER = 1;
    if (this == otherBook) {
    return EQUAL;
    }
    System.out.println("In Book's compareTo");
    if (this.numberOfPages < otherBook.numberOfPages) {
    return BEFORE;
    }
    if (this.numberOfPages > otherBook.numberOfPages) {
    return AFTER;
    }
    if (this.price < otherBook.price) {
    return BEFORE;
    }
    if (this.price > otherBook.price) {
    return AFTER;
    }
    return this.title.compareTo(otherBook.title);
    }
    @Override
    public String toString() {
        return " The Book is " +  " the numberOfPages=" + numberOfPages + ", the price is=" + price + ",  the title is  ='" + title + "the bookType is =" + bookType + '}';
    }
  
