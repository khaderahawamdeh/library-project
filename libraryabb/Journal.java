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
public class Journal extends Book{
    private String ConferenceName;
    private int ConferenceNo;

    public Journal(String ConferenceName, int ConferenceNo, String title, Author a1, int no, Date d1, String genre, int edition) {
        super(title, a1, no, d1, genre, edition);
        this.ConferenceName = ConferenceName;
        this.ConferenceNo = ConferenceNo;
    }

    public String getConferenceName() {
        return ConferenceName;
    }

    public void setConferenceName(String ConferenceName) {
        this.ConferenceName = ConferenceName;
    }

    public int getConferenceNo() {
        return ConferenceNo;
    }

    public void setConferenceNo(int ConferenceNo) {
        this.ConferenceNo = ConferenceNo;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+"conference name: "+ this.getConferenceName()+ ", conference no: "+this.getConferenceNo();
    }    

    @Override
    public boolean inLoan() {
        return super.inLoan(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
