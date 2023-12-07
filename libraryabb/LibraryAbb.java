/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryabb;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PcUser
 */
public class LibraryAbb {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. add books\n"
                    + "2. add student\n"
                    + "3. Search books\n"
                    + "4. Books Loan\n"
                    + "5. Show all Books\n"
                    + "6. add magazine or journal\n"
                    + "7. Exit");

            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Title :");
                    String t1 = scan.next();
                    System.out.println("Enter Author ID, Name, Date, Address :");
                    Author A1 = new Author(scan.nextInt(), scan.next(), new Date(scan.nextInt(), scan.nextInt(), scan.nextInt()), scan.next());
                    System.out.println("Enter No :");
                    int no = scan.nextInt();
                    System.out.println("Enter Date :");
                    Date D1 = new Date(scan.nextInt(), scan.nextInt(), scan.nextInt());
                    System.out.println("Enter Genre :");
                    String G1 = scan.next();
                    System.out.println("Enter Edition :");
                    int E1 = scan.nextInt();
                    Book B1 = new Book(t1, A1, no, D1, G1, E1);
                    books.add(B1);
                    break;
                case 2:
                    System.out.println("Enter Major :");
                    String M1 = scan.next();
                    System.out.println("Enter ID :");
                    int id = scan.nextInt();
                    System.out.println("Enter Name :");
                    String name = scan.next();
                    System.out.println("Enter Date :");
                    Date D2 = new Date(scan.nextInt(), scan.nextInt(), scan.nextInt());
                    System.out.println("Enter Address :");
                    String add = scan.next();
                    Student S1 = new Student(M1, id, name, D2, add);

                    System.out.println("How many books do you want to borrow?");
                    int numberOfBooksToBorrow = scan.nextInt();
                    if (numberOfBooksToBorrow > 3) {
                        System.out.println("you cant borrow more than 3 books");
                    } else {
                        for (int i = 0; i < numberOfBooksToBorrow; i++) {
                            System.out.println("Enter the title of the book you want to borrow:");
                            String wantedBookTitle = scan.next();

                            // Search for the book in the list of available books
                            Book wantedBook = null;
                            for (Book book : books) {
                                if (book.getTitle().equals(wantedBookTitle) && !book.isIsLoaned()) {
                                    wantedBook = book;
                                    break;
                                }
                            }

                            if (wantedBook != null) {
                                if (wantedBook instanceof Magazine) {
                                    // Handle additional details for Magazine if needed
                                    System.out.println("Enter issue no:");
                                    int issueNo = scan.nextInt();
                                    ((Magazine) wantedBook).setIssueNo(issueNo);
                                } else if (wantedBook instanceof Journal) {
                                    // Handle additional details for Journal if needed
                                    System.out.println("Enter conference name:");
                                    String conferenceName = scan.next();
                                    ((Journal) wantedBook).setConferenceName(conferenceName);
                                }

                                // Loan the book to the student
                                S1.loanBook(wantedBook);
                                System.out.println("Book '" + wantedBook.getTitle() + "' borrowed successfully.");
                            } else {
                                // The book is not available
                                System.out.println("Sorry, the book '" + wantedBookTitle + "' is not available for loan.");
                            }
                        }
                    }
                    students.add(S1);
                    break;
                case 3:
                    System.out.println("enter title, no of book and auther name to search: ");
                    String t2 = scan.next();
                    int no2 = scan.nextInt();
                    String n2 = scan.next();
                    boolean found = false;

                    for (Book book : books) {
                        if (book.getTitle().equals(t2) && book.getNo() == no2 && book.getA1().getName().equals(n2)) {
                            System.out.println("Book found:");
                            System.out.println(book.getInfo());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.println("List of loaned books:");
                    for (Book book : books) {
                        if (book.isIsLoaned()) {
                            System.out.println(book.getInfo());
                        }
                    }
                    break;
                case 5:
                    String type = null;
                    for (int i = 0; i < books.size(); i++) {
                        Book b1 = books.get(i);
                        if (b1 instanceof Magazine) {
                            type = "magazine";
                        } else if (b1 instanceof Journal) {
                            type = "journal";
                        }
                        System.out.println((i + 1) + "-" + type + ": " + b1.getInfo());
                    }
                    break;
                case 6:
                    System.out.println("journal or magazine?");
                    String type1 = scan.next();
                    if (type1.equals("magazine")) {
                        System.out.println("enter issue no: ");
                        int issue = scan.nextInt();
                        System.out.println("Enter Title :");
                        String t3 = scan.next();
                        System.out.println("Enter Author ID, Name, Date, Address :");
                        Author A2 = new Author(scan.nextInt(), scan.next(), new Date(scan.nextInt(), scan.nextInt(), scan.nextInt()), scan.next());
                        System.out.println("Enter No :");
                        int no3 = scan.nextInt();
                        System.out.println("Enter Date :");
                        Date D3 = new Date(scan.nextInt(), scan.nextInt(), scan.nextInt());
                        System.out.println("Enter Genre :");
                        String G2 = scan.next();
                        System.out.println("Enter Edition :");
                        int E2 = scan.nextInt();
                        Book B2 = new Magazine(issue, t3, A2, no3, D3, G2, E2);
                        books.add(B2);
                    } else if (type1.equals("journal")) {
                        System.out.println("enter ConferenceName: ");
                        String Con = scan.next();
                        System.out.println("enter ConferenceNo: ");
                        int Conn = scan.nextInt();
                        System.out.println("Enter Title :");
                        String t4 = scan.next();
                        System.out.println("Enter Author ID, Name, Date, Address :");
                        Author A3 = new Author(scan.nextInt(), scan.next(), new Date(scan.nextInt(), scan.nextInt(), scan.nextInt()), scan.next());
                        System.out.println("Enter No :");
                        int no4 = scan.nextInt();
                        System.out.println("Enter Date :");
                        Date D4 = new Date(scan.nextInt(), scan.nextInt(), scan.nextInt());
                        System.out.println("Enter Genre :");
                        String G3 = scan.next();
                        System.out.println("Enter Edition :");
                        int E3 = scan.nextInt();
                        Book B3 = new Journal(Con, Conn, t4, A3, no4, D4, G3, E3);
                        books.add(B3);
                    } else {
                        System.out.println("Invalid choice, please try again.");
                    }
                    break;
                    case 7:
                   System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 7);
    }

}
