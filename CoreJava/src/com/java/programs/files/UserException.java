package com.java.programs.files;

public class UserException {
	public static void main(String[] args) throws NotEligibleToWrite {
	
	  float percentage=70.6f;
	  if(percentage<75)
	  {
		  throw new NotEligibleToWrite("Not eligible to write exams");
	  }
	  else 
	   System.out.println("Eligible to write");
	  System.out.println("After completion");
	}

}
