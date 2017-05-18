package com.rama41222.FirstDayAtSchool;

import java.util.ArrayList;

public class Bag {
	

	public ArrayList<Book> getMyBooks() {
		return myBooks;
	}

	public ArrayList<NoteBook> getMyNoteBooks() {
		return myNoteBooks;
	}

	public ArrayList<Pen> getMyPens() {
		return myPens;
	}

	public ArrayList<Pencil> getMyPencils() {
		return myPencils;
	}

	ArrayList<Book> myBooks = new ArrayList<>();
	ArrayList<NoteBook> myNoteBooks = new ArrayList<>();
	ArrayList<Pen> myPens = new ArrayList<>();
	ArrayList<Pencil> myPencils = new ArrayList<>();

	public void addBooks(Book b) {
		this.myBooks.add(b);
	}

	public void addNoteBooks(NoteBook b) {
		this.myNoteBooks.add(b);
	}

	public boolean isfandlequal(String str){
		if(str.isEmpty()){
			return false;
		}else if(str.length()==2){
			return true;
		}
		System.out.println(str);
		
		String f = str.substring(0, 2);
		String l = str.substring(str.length()-2);
		System.out.println(f);
		System.out.println(l);
		
		 
			if(f.equals(l)){
				return true;
			}else{
				return false;
			}
	}
	
	public void addPencils(Pencil b) {
		this.myPencils.add(b);
	}

	public void addPens(Pen b) {
		this.myPens.add(b);
	}

	@SuppressWarnings("rawtypes")
	public ArrayList[] prepareMyBag() {
		return new ArrayList[]{ getMyPencils(),getMyPens(),getMyNoteBooks(),getMyBooks()};
		
//		myBooks.stream().forEach(book -> {
//			System.out.println(book.name);
//		});
//
//		myNoteBooks.stream().forEach(noteBook -> {
//			System.out.println(noteBook.name + "-" + noteBook.text);
//		});
//
//		myPencils.stream().forEach(pencil -> {
//			System.out.println(pencil.make);
//		});
//		myPens.stream().forEach(pen -> {
//			System.out.println(pen.make);
//		});

	}
}
/*
 * Book b = new Book("Jungle Book"); NoteBook c = new NoteBook("Maths");
 * c.setText("MY name is maths"); Pen p = new Pen("Reynolds"); Pencil x = new
 * Pencil("HB"); Bag myBag = new Bag(); myBag.addBooks(b);
 * myBag.addNoteBooks(c); myBag.addPens(p); myBag.addPencils(x);
 * 
 * myBag.prepareMyBag();
 */

 

 
 

 