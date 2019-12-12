package com.scp.java.endtoend;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BookDaoImpl implements BookDao {
	public SessionFactory sfactory =null;
	public BookDaoImpl() {
		sfactory = AppUtil.getSessionFactory();//ini
	}
	
	public int insertBook(BookEn book) {
		Session session =null;
		Transaction tr =null;
		try {
			session  = sfactory.openSession();
			tr = session.beginTransaction();
			return (Integer) session.save(book);
		}catch(Exception e) {
			return 0;
		}finally {
			AppUtil.cleanUpResources(session,tr);			
		}
	}

	public BookEn fetchBook(int bookId) {
		Session session =null;
		try {
			session  = sfactory.openSession();
			return session.get(BookEn.class, bookId);
		}catch(Exception e) {
			return null;
		}finally {
			AppUtil.cleanUpResources(session,null);			
		}
		
	}

	public List<BookEn> fetchAllBook() {
		// TODO Auto-generated method stub
		return null;
	}

	public BookEn modifyBook(BookEn book) {
		Session session =null;
		Transaction tr =null;
		try {
			session  = sfactory.openSession();
			tr = session.beginTransaction();
			session.update(book);
			return book;
		}catch(Exception e) {
			return null;
		}finally {
			AppUtil.cleanUpResources(session,tr);			
		}
	}

	public boolean removeBook(BookEn book) {
		// TODO Auto-generated method stub
		return false;
	}

}
