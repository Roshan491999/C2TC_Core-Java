package com.client;

import com.entities.Book;
import com.services.BookService;
import com.services.BookServiceImpl;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BookService bs  = new BookServiceImpl();
		/*Book b = new Book();
		b.setAuthor("Roshan");
		b.setPrice(50.0);
		b.setTitle("java");
		bs.addBook(b);
		
		Book b1 = new Book();
		b1.setAuthor("Roshan");
		b1.setPrice(20.0);
		b1.setTitle("java");
		bs.addBook(b1);
		
		Book b2 = new Book();
		b2.setAuthor("Roshan");
		b2.setPrice(35.0);
		b2.setTitle("java");
		bs.addBook(b2);
		
		Book b3 = new Book();
		b3.setAuthor("Roshan");
		b3.setPrice(45.0);
		b3.setTitle("java");
		bs.addBook(b3);
		
		
		System.out.println("Row Inserted");*/
		
		//Count Query
		/*System.out.println("Total Number of Books:" +bs.getBookCount());
		
		//Fetch Table Query
		for(Book book: bs.getAllBooks()) {
			System.out.println(book);
		}
		
		//Fetch Single Row query
		System.out.println("Book with Id 2 " + bs.getBookById(2));*/
		
		//Fetch  by author using setParameter
		/*for(Book book1: bs.getAuthorBooks("Roshan")){
			System.out.println(book1);
		}
		
		for(Book book2: bs.getBookByTitle("PHP")){
			System.out.println(book2);
		}*/
		for(Book book3: bs.getBooksInPriceRange(10, 60)){
			System.out.println(book3);
		}

	}

}
