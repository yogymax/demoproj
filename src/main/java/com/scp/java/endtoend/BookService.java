package com.scp.java.endtoend;

import java.util.List;

public interface BookService {
	public int addBook(Book book);
	public Book getBook(int bookId);
	public List<Book> getAllBook();
	public Book updateBook(Book book);
	public boolean deleteBook(int bookId);
}
