/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryabb;

import java.util.ArrayList;

/**
 *
 * @author PcUser
 */
public class Library {
    ArrayList <Student> students = new ArrayList<>();
    ArrayList <Book> books = new ArrayList<>();

    public Library(ArrayList<Student> students, ArrayList<Book> books) {
        this.students = students;
        this.books = books;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
     
    }
  

