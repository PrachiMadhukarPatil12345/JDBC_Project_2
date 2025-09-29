package com.service;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Book;
import com.dao.Bookdao;


public class BookService
{
	Bookdao bd = new Bookdao();
	
	
	public String deleteBookSevice(Book book) throws ClassNotFoundException, SQLException
	{
		return bd.deleteBookdao(book);
	}
	
	
	
	
	
	public String UpdateBookService(Book book) throws ClassNotFoundException, SQLException
	{
		return bd.UpdateBookdao(book);
	}
	
	
	
	
	
	
	
	
	public String MyService(ArrayList <Book> bj)            throws ClassNotFoundException, SQLException
	{
		String bs = bd.BookdaoMethod(bj);
		return bs;
	}
	
	
	
	public ArrayList<Book>  getAllRecordsService() throws ClassNotFoundException, SQLException
	{
		return bd.getAllRecords();
		
	}
	
	



	public Book getRecordsByIdSevice(int p) throws ClassNotFoundException, SQLException
	{
		Book oo = bd.getRecordsById(p);
		if(oo == null)
		{
			throw new BookNotFoundException("Book not found for Id " + p);
		}
		return oo;
	}
	
}
