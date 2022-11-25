package com.waste;

 class Karthi{
	 public void sum(int x,float y) {
		 float D=x+y;
		 System.out.println(D);
	 }
	 }
	 public class overRide extends Karthi{
		 public void sum(int x,float y) {
			 super.sum(x,y);
			 float F=x*y;
			 System.out.println(F);
		 }
		 public static void main(String[]args) {
			 overRide G=new overRide();
			 G.sum(3,6.3f);
		 }
	 }
	
	
	
	
