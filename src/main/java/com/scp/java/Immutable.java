package com.scp.java;

import java.lang.reflect.Field;
import java.util.Date;

public class Immutable {
	int var=10;
	
	/**
	 * 	
	
	
	final field -- wherever defined specify value--
	blank final -- first declare
				assign value inside 
						either 	
							constructors -- all
							instance blocks -- one
							
	static final field -- wherever defined specify value--
	blank final -- first declare
				assign value inside 
							static blocks -- one
							
							
	 * 
	 * 
	 * 
	 * @param args
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
	
		/**
		 * final
		 * 		final field
		 * 		blank final field
		 * 
		 */
		
		A a1= new A();
		A a2= new A();
		System.out.println(a1);
		System.out.println(a2);
		Field[] fields = a1.getClass().getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);//permit access for time being
			System.out.println(a1);
			field.set(a1,200);
			System.out.println(a1);
			field.set(a1,300);
			System.out.println(a1);
			field.set(a1,400);
			System.out.println(a1);
			field.set(a1,500);
			System.out.println(a1);
		}

		
		System.out.println(a1);
		System.out.println(a2);
		
		System.exit(0);
		//primitive -- final -- immutable
		//string-- final -- value--self-- ref--final
		//wrappers --finall -- value--self--ref--final
		
		
		
		String s1="abc";
		s1="pqr";
		

		Author a11= new Author(1122333, "Amit");
		final Book b1 = new Book(1100,"AAA",a11,new Date(2019, 12, 10));
		System.out.println(b1);
	}
}

class Author{
	final private int authorId;
	final private String authorName;
	public Author(int authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + "]";
	}
	public int getAuthorId() {
		return authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	
}

class Book{
	final private int bookId;  // primitive -- values cannot be changed-- final
	final private  String bookName; // ref+value -- final
	final private Author author;
	final private Date date;//ref final
	
	
	public Date getDate() {
		Date dt= new Date(date.getYear(),date.getMonth(),date.getDay());
		return dt;
	}
	public Author getAuthor() {
		return author;
	}
	
	public Book(int bookId, String bookName, Author author, Date date) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.date = date;
	}
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", date=" + date + "]";
	}
	
	
}


/**
 
 
		final int num=10; //11x
		//num=20;//11x
		
		final Integer number=10;//10  --100x
		//number=20; // 2003x
		
		String s1= "ABC"; // immutable but value point of view
		final String s2="ABC"; // immutable --both ways--ref[final]+value[string imm prop]
		 
 * */



class A{
	final private int  num;
	
	{
		num=10;
	}
	
	public A(int num) {
		super();
		//this.num = num;
	}
	
	public A() {
		//num=10;
	}



	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}
	
	
}