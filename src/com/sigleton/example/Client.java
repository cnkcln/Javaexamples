package com.sigleton.example;

public class Client {
	 
	  public static void main(String[] args)
	  {
	 
	      AccountCreation tc = AccountCreation.getInstance();
	      AccountCreation tc1 = AccountCreation.getInstance();
	 
	      tc.create(12345);
	      tc1.create(67891);
	 
	  }
	}