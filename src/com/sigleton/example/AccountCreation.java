package com.sigleton.example;

public class AccountCreation {
 
    private static AccountCreation instance;
 
    private AccountCreation(){
       //Private Constructor
    }
 
    public synchronized static AccountCreation getInstance()
    {
           if (instance==null)
           {
              instance = new AccountCreation();
              System.out.println("AccountCreation Class Object creatred...!!!");
           }
          else{
              System.out.println("AccountCreation Class Object not Creatred just returned Created one...!!!");
          }
              return instance;
       }
 
       public void create(int no)
       {
          System.out.println("Account Created Successfully, with Number:" +no);
       }
 
}