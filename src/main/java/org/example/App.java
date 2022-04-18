package org.example;

import java.util.Arrays;
import java.util.List;


public class App {

  public static void main(String[] args) {
    Book book1 = new Book("Lord of the Rings: The Two Towers", "J.R.R.", "Tolkien", 464);
    Book book2 = new Book("Endgame", "Tom", "Clancy", 337);
    Book book3 = new Book("Priestess of the White", "Trudi", "Canavan", 688);
    Book book4 = new Book("Blood of Elves", "Andrzej", "Sapkowski", 320);
    Book book5 = new Book("Dragonwing", "Margaret", "Weis", 409);
    Book book6 = new Book("Hyperion", "Dan", "Simmons", 496);

    List<Book> bookList = Arrays.asList(book1, book2, book3, book4, book5, book6);


    //Filter books with pages >400
    System.out.println("---All books over 400 pages ---");
    //without foreach in stream operation
    //code here


    //with foreach in stream operation
    //code here


    System.out.println("---All unique items---");
    //code here


    System.out.println("---All books of authors with Last Name starting with 'C', ordered on last name---");
    //code here

    System.out.println("---All books of authors with Last Name starting with 'C', ordered on book title---");
    //code here


    System.out.println("--Amount of books where author first name equals 3 characters");
    //code here

    System.out.println("--Total amount of pages of all books with author Last Name starting with 'S'--");
    //code here


    System.out.println("--Display the first book that contains 300-400 pages with a character 'o' in it's title");
    //code here


  }
}