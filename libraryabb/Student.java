/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryabb;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author PcUser
 */
public class Student extends Person{
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private String major;

    public Student(String major, int id, String name, Date d1, String address) {
        super(id, name, d1, address);
        this.major = major;
    }

    public Student(ArrayList<Book> borrowedBooks, String major, int id, String name, Date d1, String address) {
        super(id, name, d1, address);
        this.borrowedBooks = borrowedBooks;
        this.major = major;
    }
    
     public void loanBook(Book book) {
        if (borrowedBooks.size() < 3) {
           
            borrowedBooks.add(book);

          LocalDate dueDate = LocalDate.now().plusDays(5);
           
            System.out.println("Book '" + book.getTitle() + "' borrowed.");
            System.out.println("Due Date: " + dueDate);
        } else {
            System.out.println("Cannot borrow more than 3 books.");
}
     }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
