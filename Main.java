package org.example.day03task03;

public class Main {

    public static void main(String[] args) {

        OnlineLibrary onlineLibrary = new OnlineLibrary(2000);
        Book book1 = new Book("Ana Karenina","Tolstoi","Philosophia",100);
        Book book2 = new Book("Tata bogat, tata sarac","Robert Kyiosaky","Financial education",250);
        Book book3 = new Book("De la idee la bani","Napoleon Hill","Financial",70);
        Book book4 = new Book("Java - Structuri de date si algoritmi","Gigel de la taraba","Programming",7000);

        try {
            onlineLibrary.addBook(book1);
            onlineLibrary.addBook(book2);
            onlineLibrary.addBook(book3);
        } catch (NotEnoughMoneyException e){
            System.out.println("NotEnoughMoneyException was caught");
            System.out.println(e.getMessage());
        }

        try {
            onlineLibrary.getBook("Java - Structuri de date si algoritmi");
        } catch (NotSuchBookException e){
            System.out.println("NotSuchBookException was caught");
            try {
                System.out.println("The books from the library before book4: ");
                onlineLibrary.printBooks();
                onlineLibrary.addBook(book4);
            } catch (NotEnoughMoneyException e2){
                System.out.println("NotEnoughMoneyException2 was caught");
                System.out.println(e2.getMessage());
            }
        }
        System.out.println("The books from the library are: ");
        onlineLibrary.printBooks();
    }
}
