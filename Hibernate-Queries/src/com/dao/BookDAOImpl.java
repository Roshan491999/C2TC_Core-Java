package com.dao;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.Query;
import com.entities.Book;

//import Stream.student;
;

public class BookDAOImpl implements BookDAO{
	
private EntityManager em;
	
	public BookDAOImpl() {
		em = JUtil.getEntityManager();
	}

	
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		Book book = em.find(Book.class, id);
		return book;
	}

	
	public List<Book> getBookByTitle(String title) {
		// TODO Auto-generated method stub
		String s = "Select book from Book book where book.title LIKE :ptitle";
		TypedQuery<Book> query = em.createQuery(s, Book.class);
		query.setParameter("ptitle","%"+ title+ "%");
		return query.getResultList();
	}

	
	public Long getBookCount() {
		// TODO Auto-generated method stub
		String s = "Select COUNT(book.id) from Book book";
		TypedQuery<Long> query = em.createQuery(s,Long.class); 
		Long count = query.getSingleResult();
		return count;
	}
	
	
	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		String s = "Select book from Book book where book.author = :pAuthor";
		TypedQuery<Book> query = em.createQuery(s, Book.class);
		query.setParameter("pAuthor", author);
		List<Book> b =query.getResultList();
		return b;
	}

	
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		Query query = (Query) em.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book> bookList = query.getResultList();
		return bookList;
	}

	
	public List<Book> getBooksInPriceRange(double low, double high) {
		// TODO Auto-generated method stub
		String s = "Select book from Book book  where book.price between :low and :high";
		TypedQuery<Book> query = em.createQuery(s, Book.class);
		query.setParameter("low", low);
		query.setParameter("high", high);
		List<Book> bookList = query.getResultList();
		Stream <Book> ss = bookList.stream();
		//OptionalDouble od = bookList.stream().filter((b) -> b.getPrice()<50).mapToDouble(Book::getPrice).average();
		System.out.println("Min Price ="+bookList.stream().min(Comparator.comparing(Book::getPrice)));
		//System.out.println("average"+od);
	 bookList.clear();
		 //bookList.contains(od);
		return bookList;
	}


	@Override
	public void commitTranscation() {
		// TODO Auto-generated method stub
		em.getTransaction().commit();
	}


	@Override
	public void beginTranscation() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
	}


	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		em.persist(book);
	}

}
