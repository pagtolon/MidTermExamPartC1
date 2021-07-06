/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidtermExamPartC;

/**
 *
 * @author 
 */
public class Account {
    
 
    private String userName;//the userID
    private String AccountNum; // account number
    private String AccountType;// the user's account type
    public final static String [] account_types={"Checking","CC","StudentLoan", "LanzStudentAccount"};

    /**
     * A constructor that takes in the userName and the Account type
     *
     * @param chosenName the ID to assign to this user
     * @param chosenType the users account type
     */
    public Account(String chosenName,String chosenType) {
        userName = chosenName;
        AccountType = chosenType;
        AccountNum= "A-"+(int)(1000+Math.random()*9000);
    }

    /**
     * A getter for the userName
     *
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }
    
     public String getAccountNum() {
        return AccountNum;
    }


    /**
     * @param userName the userName to set
     */
    public void setUserID(String name) {
        userName = name;
    }

    /**
     * A getter for the Account Type
     *
     * @return the type
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * @param genre the genre to set
     */
    public void setAccountType(String type) {
        this.AccountType = type;
    }

//end class
   
}