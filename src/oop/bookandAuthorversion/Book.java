package oop.bookandAuthorversion;

public class Book {
private String isbn;
private String name;
private Author author;
private double price;
private int quantity=0;
public Book(String isbn, String name, Author author, double price, int quantity) {
	super();
	this.isbn = isbn;
	this.name = name;
	this.author = author;
	this.price = price;
	this.quantity = quantity;
}
public Book(String isbn, String name, Author author, double price) {
	super();
	this.isbn = isbn;
	this.name = name;
	this.author = author;
	this.price = price;
}
public Book() {}
public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}
