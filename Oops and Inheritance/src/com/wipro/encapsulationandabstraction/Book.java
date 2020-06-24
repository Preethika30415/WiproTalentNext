package com.wipro.encapsulationandabstraction;

public class Book 
{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	public Book(String name,Author author,double price,int qtyInstock) 
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInstock;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public Author getAuthor() 
	{
		return author;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getQtyInstock() 
	{
		return qtyInStock;
	}
	public void setQtyInstock(int qtyInstock) 
	{
		this.qtyInStock = qtyInstock;
	}
	public static void main(String [] args) 
	{
		Book b= new Book("Compilers",new Author("Kapil Isapuari","kapilisapuari@gmail.com",'F'),679.3,9);
		b.setPrice(220.7);
		b.setQtyInstock(9);
		System.out.println("The name of book is "+b.getName());
		System.out.println("The details of the author are: name- "+b.getAuthor().getName()+" email- "+b.getAuthor().getEmail()+" and gender- "+b.getAuthor().getGender());
		System.out.println("Number of copies and price of each copy is "+b.getQtyInstock()+", "+b.getPrice());
	}
}
