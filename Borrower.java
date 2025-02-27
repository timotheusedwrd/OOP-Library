import java.util.ArrayList;

public class Borrower {
    String name;
    ArrayList<Book> borrowedBooks = new ArrayList<>();
    public Borrower(String name){
        this.name = name;
    }

    public void displayBorrowedBooks(){
        System.out.println(this.name + "'s Borrowed Books:");
        for(Book i : borrowedBooks){
            System.out.println("Title: " + i.title);
            System.out.println("ISBN: " + i.ISBN);
            System.out.println("Author: " + i.author.name);
            System.out.println("Biography: " + i.author.desc);
            System.out.println("--------------------------");
        }
    }
}