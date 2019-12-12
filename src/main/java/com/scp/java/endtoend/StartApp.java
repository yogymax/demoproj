package com.scp.java.endtoend;

public class StartApp {

	public static void main(String[] args) {
		BookServiceImpl service = new BookServiceImpl();//s d  sf
		Book book = new Book("XXXXX",33333.34,"TTTTT+");
		book.setBkId(3);
		service.updateBook(book);
		

		System.exit(0);
		int num = service.addBook(new Book("JAVA",2388.34,"AAAA+"));
		
		String output = num>0 	?	" "+num+" Book Successfully Saved "	:	" "+num+" Book Operation failed..!";
		System.out.println(output);
		
		num = service.addBook(new Book("HIBERNATE",2388.34,"AAAA+"));
		output = num>0 	?	" "+num+" Book Successfully Saved "	:	" "+num+" Book Operation failed..!";
		System.out.println(output);
		
		num = service.addBook(new Book("WEBSERVICES",2388.34,"AAAA+"));
		output = num>0 	?	" "+num+" Book Successfully Saved "	:	" "+num+" Book Operation failed..!";
		System.out.println(output);
		
		num = service.addBook(new Book("AWS",2388.34,"AAAA+"));
		output = num>0 	?	" "+num+" Book Successfully Saved "	:	" "+num+" Book Operation failed..!";
		System.out.println(output);
		
		num = service.addBook(new Book("SPRING",2388.34,"AAAA+"));
		output = num>0 	?	" "+num+" Book Successfully Saved "	:	" "+num+" Book Operation failed..!";
		System.out.println(output);
		
		/*
		System.out.println("Service -- "+service.hashCode());//serviceimpl
		System.out.println("DAO-- "+service.bookDatabaseOp.hashCode());//daoimpl
		System.out.println("Sfactory -- "+service.bookDatabaseOp.sfactory.hashCode());//daoimpl
		*/
	}
}
