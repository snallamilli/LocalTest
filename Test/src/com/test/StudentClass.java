package com.test;

public class StudentClass {
	int rollNum;
	   String studentName;
	   Address studentAddr; 
	   StudentClass(int roll, String name, Address addr){
	       this.rollNum=roll;
	       this.studentName=name;
	       this.studentAddr = addr;
	   }
	   public static void main(String args[]){
	       Address ad = new Address(55, "Agra", "UP", "India");
	       StudentClass obj = new StudentClass(123, "Chaitanya", ad);
	       System.out.println(obj.rollNum);
	       System.out.println(obj.studentName);
	       System.out.println(ad.streetNum);
	       System.out.println(obj.studentAddr.city);
	       System.out.println(obj.studentAddr.state);
	       System.out.println(obj.studentAddr.country);
	   }
}
