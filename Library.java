import java.util.*;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book){
        this.books.add(book);
        System.out.println("Book added to library : " + book.title);
    }

    public void borrowBook(Borrower borrower, Book book){
        for(Book i : books){
            if(i == book){
                borrower.borrowedBooks.add(book);
                books.remove(book);
                System.out.println(borrower.name + " borrowed: " + book.title);
                break;
            }
        }
    }

    public void returnBook(Borrower borrower, Book book){
        for(Book i : borrower.borrowedBooks){
            if(i == book){
                books.add(book);
                borrower.borrowedBooks.remove(book);
                System.out.println(borrower.name + " returned: " + book.title);
                break;
            }
        }
    }

    public void displayLibraryBooks(){
        System.out.println("Books in Library");
        for(Book i : books){
            System.out.println("Title: " + i.title);
            System.out.println("ISBN: " + i.ISBN);
            System.out.println("Author: " + i.author.name);
            System.out.println("Biography: " + i.author.desc);
        }
    }
}