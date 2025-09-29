package com.main;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Book;
import com.controller.BookController;
import com.service.BookNotFoundException;

public class Main
{
	

	public static void main(String[] args)                     throws ClassNotFoundException, SQLException
	{ 
		BookController bc = new BookController();
		
		Book z = new Book(9,"S.S Das","Vrjshvari");
		
		System.out.println( bc.deleteBookController( z)   ); 
		
		
		
		
		
		 /* Book z = new Book(7,
		 * "S.S Das","Vrjshvari");
		 * 
		 * String r = bc.UpdateBookController (z); System.out.println(r);
		 */
		
		
		
		
		
		/*
		 * // try // { // Book obj5 = bc.getRecordsByIdController(1); // //
		 * System.out.println(obj5.getB_id()); // System.out.println(obj5.getB_name());
		 * // System.out.println(obj5.getAuthor()); // //
		 * System.out.println("==============================================="); // }
		 * // catch(BookNotFoundException e) // { // System.out.println(e.getMessage());
		 * // }
		 */			
		
//		ArrayList<Book> myarlist = bc.Controller_getAllRecords();
//		
//		for(Book obj : myarlist )
//		{
//			System.out.println(obj.getB_id());
//			System.out.println(obj.getB_name());
//			System.out.println(obj.getAuthor());
//			
//			System.out.println("===============================================");
//		}
		
		
		
		/*
		 * ArrayList <Book> bok = new ArrayList<>();
		 * 
		 * Book bk1 = new Book(); bk1.setB_id(6); bk1.setB_name("Advnced Java");
		 * bk1.setAuthor("f.h. Bfdggh "); bok.add(bk1);
		 * 
		 * Book bk2 = new Book(); bk2.setB_id(7); bk2.setB_name("Core_JAVA");
		 * bk2.setAuthor("f.h. Sgghi "); bok.add(bk2);
		 * 
		 * Book bk3 = new Book(); bk3.setB_id(8); bk3.setB_name("SpringBoot");
		 * bk3.setAuthor("f.h. Cvbmm "); bok.add(bk3);
		 * 
		 * Book bk4 = new Book(); bk4.setB_id(9); bk4.setB_name("Hibernate");
		 * bk4.setAuthor("A.D.Dfgvtf "); bok.add(bk4);
		 * 
		 * Book bk5 = new Book(); bk5.setB_id(6); bk5.setB_name("WebDevelopment");
		 * bk5.setAuthor("f.h. Fvbgh "); bok.add(bk5);
		 * 
		 * Book bk6 = new Book(); bk6.setB_id(6); bk6.setB_name("Cloud Computing");
		 * bk6.setAuthor("f.h. Pefdggh "); bok.add(bk6);
		 * 
		 */
		
		
		//  String myBookController = bc.MyBookController(bok);
		// System.out.println(myBookController);
	}

}
