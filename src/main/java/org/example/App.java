package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

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
    //code here


    //with foreach in stream operation
    //code here
    bookList.stream()
            .filter(book -> book.getPages() > 400)
            .forEach(System.out::println);

    System.out.println("---All unique items---");
    //code here
    bookList.stream()
            .distinct()
            .forEach(System.out::println);


    System.out.println("---All books of authors with Last Name starting with 'C', ordered on last name---");
    //weergave van de lijst van boeken van auteurs met familienaam die start met een "C", gesorteerd op familienaam
    bookList.stream()
            .filter(book -> book.getAuthorLastName().startsWith("C"))
            .sorted(comparing(book -> book.getAuthorLastName()))
            .forEach(System.out::println);

    System.out.println("---All books of authors with Last Name starting with 'C', ordered on book title---");
    //idem, maar gesorteerd op boektitel
    bookList.stream()
            .filter(book -> book.getAuthorLastName().startsWith("C"))
            .sorted(comparing(book -> book.getTitle()))
            .forEach(System.out::println);


    System.out.println("--Amount of books where author first name equals 3 characters");
    List<Book> amountOfBooks = bookList.stream()
            .filter(book -> book.getAuthorFirstName().length() == 3)
            .collect(toList());
    System.out.println(amountOfBooks.stream().count());

    System.out.println("--Total amount of pages of all books with author Last Name starting with 'S'");
    System.out.println(bookList.stream()
            .filter(book -> book.getAuthorLastName().startsWith("S"))
            .map(Book::getPages)          //gaat van type book naar type Integer via de methode aanroep)
            .reduce(0,(total,book)->total+book));


    System.out.println("--Display the first book that contains 300-400 pages with a character 'o' in it's title");
    bookList.stream()
            .filter(book -> book.getPages() > 300 && book.getPages() < 400)
            .filter(book -> book.getTitle().contains("o"))
            .limit(1)
            .forEach(System.out::println);
  }
}