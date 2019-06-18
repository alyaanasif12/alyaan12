/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
/**
 *
 * @author Sivagama
 */
public class Account {

    
        private double balance;
        private double interestRate=0.23;
        private String user;
 
     /**constructor that takes the initial balance
      * @param initialBalance 
      */
        public Account(double initialBalance,String givenUser)
        {
            balance=initialBalance;
            user=givenUser;
            //Note that the initial balance must be greater than 50.    
            //created it by using an if statement in which if balance is > 50 then its created 
            //Otherwise not
            //It incorporates good design because its talking about whether account can be created by specfic rule
            if(balance > 50) {
                System.out.println("Account has been Created");
            } else {
                System.out.println("Not created");
            }
        }

     /**The method for depositing amount and 
      * updating balance*/
        public void credit(double amount)
        {
            balance=getBalance()+amount;
        }

     /**The method for debit(withdrawing amount) and 
      * updating balance */
        public void debit(double amount)
        {
            balance=getBalance()-amount;

        }
        
     /**The getter for the balance
     * @return the balance
     */
        public double getBalance() 
        {
        return balance;
        }

    /**The getter for InterestRate
     * @return the interestRate
     */
        public double getInterestRate() 
        {
            //multiples by balance
            return interestRate * balance;
        }

    /**user is the read only field
     * @return the user
     */
    public String getUser() {
        return user;
    }
    
    
}//class end
