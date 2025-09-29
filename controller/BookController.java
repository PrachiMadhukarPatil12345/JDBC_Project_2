package com.controller;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Book;
import com.service.BookService;


public class BookController
{
	BookService bs= new BookService();
	
	

	public String deleteBookController(Book book) throws ClassNotFoundException, SQLException
	{
		return bs.deleteBookSevice(book);
	}
	
	
	
	public String UpdateBookController (Book book) throws ClassNotFoundException, SQLException
	{
		return bs.UpdateBookService(book);
	}
	
	
	
	
//	public String MyBookController(ArrayList <Book> books) throws ClassNotFoundException, SQLException
//	{
//		 String myService = bs.MyService(books);
//		 return myService;
//	}
	
	
	
	   public ArrayList<Book> Controller_getAllRecords()    throws ClassNotFoundException, SQLException
	   {
		 
		   return bs.getAllRecordsService();
	
	   }
	   
	   public Book getRecordsByIdController(int p)    throws ClassNotFoundException, SQLException
	   {
		return  bs.getRecordsByIdSevice(p);
	   }



	
}
