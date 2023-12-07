/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryabb;

/**
 *
 * @author PcUser
 */
public class Book implements Display{
    private String title; 
    private Author a1;
    private int no;
    private Date d1;
    private String genre; 
    private int edition;
    private boolean isLoaned;
   
    public Book(String title, Author a1, int no, Date d1, String genre, int edition) {
        this.title = title;
        this.a1 = a1;
        this.no = no;
        this.d1 = d1;
        this.genre = genre;
        this.edition = edition;
        this.isLoaned=false;
       
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getA1() {
        return a1;
    }

    public void setA1(Author a1) {
        this.a1 = a1;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public boolean isIsLoaned() {
        return isLoaned;
    }

    public void setIsLoaned(boolean isLoaned) {
        this.isLoaned = isLoaned;
    }
     

    @Override
    public String getInfo(){
        return "title: " + this.getTitle()+",Author: "+ this.getA1().getName()+",NO: "+ this.getNo()+
                ", genre: "+this.getGenre()+",Editin: "+this.getEdition() + "Date :" + this.getD1().getDay()
                + "/" + this.getD1().getMonth() + "/" + this.getD1().getYear() + "is Looaned :" + isLoaned;
    }

    @Override
  public boolean inLoan(){
      return isLoaned;
}
   
}
