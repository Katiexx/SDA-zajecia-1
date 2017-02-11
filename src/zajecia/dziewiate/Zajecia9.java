package zajecia.dziewiate;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-11.
 */
public class Zajecia9 {
    public static void main(String[] args) {
        String message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        BookShelf bookShelf = new BookShelf();
        Author henrykSienkiewicz = new Author("Henryk", "Sienkiewicz");
        Book book = new Book("The Little Prince", new Author("Antonie", "de Saint Exupery"), message.split(" "), 2005);
        Book book2 = new Book("Ogniem i mieczem", henrykSienkiewicz, message.split(" "), 2060);
        Book book3 = new Book("Pan Wolodyjowski", henrykSienkiewicz, message.split(" "), 2012);
        Book book4 = new Book("Krzyzacy", henrykSienkiewicz, message.split(" "), 2008);
        bookShelf.add(book);
        bookShelf.add(book2);
        bookShelf.add(book3);
        bookShelf.add(book4);
        ArrayList<Book> booksOf = bookShelf.getBooksOf("Henryk Sienkiewicz");
        for (Book b : booksOf) {
            System.out.println(b);
        }

        System.out.println(book.toString());


//        User user = new User("Zosia", "Kowalska", "24.08.1995");
//        Address address = new Address("Poznan", "Polna", 23, "23-213", "Poland");
//        user.address = address;
//        user.print();

    }

    public static void printUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].print();
        }
    }
}


