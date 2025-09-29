package com.Entity;

import java.util.ArrayList;

public class Book
{
	int B_id;
	String B_name;
	String Author;
	
	
	public int getB_id() {
		return B_id;
	}
	public void setB_id(int b_id) {
		B_id = b_id;
	}
	public String getB_name() {
		return B_name;
	}
	public void setB_name(String b_name) {
		B_name = b_name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Book(int b_id, String b_name, String author) {
		super();
		B_id = b_id;
		B_name = b_name;
		Author = author;
	}
	
	
}
