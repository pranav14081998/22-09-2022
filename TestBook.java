package com.exercise.bll;

public class TestBook {

	public static void main(String[] args) {
	
		Author aut=new Author("Baba","babakinagri@gmail.com");
		
		Book book=new Book("1001","Devottee",aut,150.0);
		System.out.println(book);
		System.out.println(book.getAuthor().getName());
		
		Book book1=new Book("1011","Regional",aut,100,5);
		System.out.println(book1);	
		System.out.println(book1.getAuthor().getName());
	
		 
		
		System.out.println(aut.getName()); 
	}

	

}
