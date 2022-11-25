package com.waste;

class Clock{
	public void student() {
		System.out.println("student name");
	}
	public int student(int x,int y) {
	return x+y; 	
	}
	public float student(float w,float o) {
		return w*o;
	}
}                                                      


public class timeOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Clock obj = new Clock();
      obj.student();
      System.out.println("two float value :"+obj.student(2.3f,3.5f));
      System.out.println("two integer value :"+obj.student(4,5));
      
	}

}
