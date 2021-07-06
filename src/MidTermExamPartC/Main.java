/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MidTermExamPartC;

import java.util.Scanner;
/**
 *
 * @author Lanzp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String uName = "";
        String accountN = "";
        
        System.out.println("Hello please enter a user name for you");
        uName = input.next();
        
        //System.out.println(uName);
        System.out.println("________________________________________");
        
        System.out.println("Please enter an account number for you");
        accountN = input.next();
        
        System.out.println(accountN);
        System.out.println("________________________________________");
        
        System.out.println("Please choose an account "
                + "type for you. Enter 1 for 'Checking', "
                + "2 for 'CC', 3 for 'StudentLoan' and 4 "
                + "for 'LanzStudentAccount' ");
    }
    
}
