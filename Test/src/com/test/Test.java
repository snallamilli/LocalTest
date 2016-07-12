package com.test;

public class Test extends ABC {
	   public void disp(){
		      System.out.println("disp() method of Child class");
		   }
		   public void xyz(){
		      System.out.println("xyz() method of Child class");
		   }
		   public static void main( String args[]) {
		      //Parent class reference to child class object
		      ABC obj = new Test();
		      obj.disp();
		      obj.abc();
		      System.out.println("Done");
		   }
}
