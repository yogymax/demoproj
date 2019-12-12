package com.scp.java.endtoend;

import java.util.List;

//business part..
public class BookServiceImpl implements BookService{

	public BookDaoImpl bookDatabaseOp = null;
	public BookServiceImpl() {
		bookDatabaseOp = new BookDaoImpl();//ini
	}
	
	
	public int addBook(Book book) {
		int num=0;
		if(book==null) {
			System.out.println("Invalid book ...");
		}else if(book.getBkPrice()<100) {
			System.out.println("Invalid Price");
		}else {
			num= bookDatabaseOp.insertBook(convertToEntity(book));
			System.out.println("Book Saved Successfully....!");
		}
		return num;
	}

	private BookEn convertToEntity(Book book) {
		BookEn en = new BookEn();
		en.setBookName(book.getBkName());
		en.setBookPrice(book.getBkPrice());
		en.setBookRemarks(book.getBkRemarks());
		return en;
	}


	public Book getBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

	public Book updateBook(Book book) {
		if(book!=null) {
			if(book.getBkId()<=0) {
				System.out.println("invalid book id...");
				return null;
			}
			BookEn entity = bookDatabaseOp.fetchBook(book.getBkId());
			if(entity!=null) { //present inside db
				BookEn en = convertToEntity(book);
				en.setBookId(book.getBkId());
				entity = bookDatabaseOp.modifyBook(en);
				System.out.println("Book Information Updated successfully...!");
				return convertToBook(entity);
			}
			System.out.println("Specified Id Book Not Found..so cannot update..");
		}else {
			System.out.println("invalid Book so cannot update..");
		}
		return null;
	}

	private Book convertToBook(BookEn entity) {
		Book bk =new Book();
		bk.setBkName(entity.getBookName());
		bk.setBkPrice(entity.getBookPrice());
		bk.setBkRemarks(entity.getBookRemarks());
		bk.setBkId(entity.getBookId());
		return bk;
	}


	public boolean deleteBook(int bookId) {
		//get book -- dao-- single-- present/absent
		return false;
	}

}
