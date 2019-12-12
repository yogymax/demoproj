package com.scp.java.endtoend;

import java.util.List;

public interface BookDao {
	

	public int insertBook(BookEn book);
	public BookEn fetchBook(int bookId);
	public List<BookEn> fetchAllBook();
	public BookEn modifyBook(BookEn book);
	public boolean removeBook(BookEn book);//*


}
