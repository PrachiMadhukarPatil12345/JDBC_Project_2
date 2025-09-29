package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.Entity.Book;
import com.utility.DBconnection;

public class Bookdao
{



	public String BookdaoMethod(ArrayList <Book> mybookset) throws ClassNotFoundException, SQLException
	{
		Connection con = DBconnection.DBconnectionMethod();

		String  s = " INSERT INTO Book values (?,?,? )  ";

		PreparedStatement pst = con.prepareStatement(s);

		for (Book b:  mybookset)
		{
			pst.setInt(1, b.getB_id());
			pst.setString(2, b.getB_name()  );
			pst.setString(3, b.getAuthor());

			pst.addBatch(); 
		}

		int[] arr = pst.executeBatch();

		return  arr.length     +  "Employee Inserted successfully";

	}



	public static  ArrayList<Book> getAllRecords()      throws ClassNotFoundException, SQLException
	{
		ArrayList <Book> bkList = new ArrayList<Book>() ;

		Connection conn = DBconnection.DBconnectionMethod();
		PreparedStatement	pst2= conn.prepareStatement("SELECT * FROM BOOK ");


		ResultSet rs = pst2.executeQuery();

		//	 while(rs.next() )
		//	 {
		//		int id = rs.getInt("id");
		//		String name=  rs.getString("name");
		//		String Author =  rs.getString("Author");
		//		
		//		Book bd= new Book(id,name, Author);
		//		bkList.add(bd);
		//		
		//		/*
		//		 * System.out.print(id); System.out.print(name); System.out.print(Author);
		//		 */
		//	 }

		return bkList ;
	}


	public static Book getRecordsById(int id) throws ClassNotFoundException, SQLException
	{
		Connection con = DBconnection.DBconnectionMethod();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM BOOK WHERE id=?");

		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();

		Book bookobj =null;

		while(rs.next() )
		{
			int i = rs.getInt("id");
			String str =	rs.getString("name");
			String strn = rs.getString("author");

			bookobj = new Book(i, str, strn);
		}

		return bookobj;

	}


	public String UpdateBookdao(Book book)             throws ClassNotFoundException, SQLException
	{
		Connection con = DBconnection.DBconnectionMethod();
		PreparedStatement pst = con.prepareStatement(" UpDATE BOOK SET name = ?, Author =? WHERE ID = ?");
		pst.setString(1, book.getB_name());
		pst.setString(2,book.getAuthor());
		pst.setInt(3, book.getB_id());

		pst.executeUpdate();
		return "Book updated ";

	}
	
	public String deleteBookdao(Book book)       throws ClassNotFoundException, SQLException
	{
		Connection con = DBconnection.DBconnectionMethod();
		PreparedStatement pst = con.prepareStatement("DELETE FROM BOOK WHERE id =?" );
		pst.setInt(1, book.getB_id() );
		
		pst.executeUpdate();
		
		return "Record Deleteed";
		
	}

}	






/*
 * public static void main(String[] args) throws ClassNotFoundException,
 * SQLException
 * 
 * { Bookdao bd = new Bookdao();
 * 
 * Book b1= new Book(); b1.setB_id(1); b1.setB_name("Gitas");
 * b1.setAuthor("me");
 * 
 * Book b2= new Book();
 * 
 * 
 * String bd1 = bd.BookdaoMethod(b1); System.out.println(bd1);
 * 
 * bd.BookdaoMethod(b2);
 * 
 * }
 */








//	public static void createTable() throws ClassNotFoundException, SQLException
//	{ 
//		Connection con = db.DBconnectionMethod();
//		Statement st = con.createStatement();
//		st.execute("create table Book (ID int , NAME varchar(20), AUTHOR varchar(25) ) ");
//		System.out.println("Table created");
// statement.execute(" create table employee (id int,name varchar(34),salary double, dep varchar(20)   )");
//	}



//	public static void main(String[] args)
//	{
//		Bookdao bd = new Bookdao();
//		bd.createTable();
//
//	}

