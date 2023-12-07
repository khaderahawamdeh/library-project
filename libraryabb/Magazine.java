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
public class Magazine extends Book {
    private int issueNo;

    
    public Magazine( int issureNo, String title, Author a1, int no, Date d1, String genere, int edition) {
        super(title, a1, no, d1, genere, edition);
        this.issueNo = issureNo;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issureNo) {
        this.issueNo = issureNo;
    }
    
    @Override
    public String getInfo(){
        return super.getInfo()+ ",issue no: "+this.getIssueNo();
    }

    @Override
    public boolean inLoan() {
        return super.inLoan(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

