package org.example.day03task03;

import java.util.ArrayList;
import java.util.List;

public class OnlineLibrary {

    private double budget;

    private List<Book> bookList = new ArrayList<>();

    public OnlineLibrary(double budget) {
        this.budget = budget;
    }

    public void addBook(Book book) throws NotEnoughMoneyException {
        if(budget < book.getPrice()){
            throw new NotEnoughMoneyException("There is no sufficient budgetto buy the book " + book.getTitle());
        }
        bookList.add(book);
        System.out.println("The book " + book.getTitle() + " was added to your cart");
        budget -= book.getPrice();
    }

    public Book getBook(String title) throws NotSuchBookException {
        for(Book b : bookList){
            if(b.getTitle().equals(title)) {
                return b;
            }
        }
        throw new NotSuchBookException("The book " + title + " wans't found in the library");
    }

    public void printBooks(){
        for(Book b : bookList){
            System.out.println(b);
        }
    }
}

