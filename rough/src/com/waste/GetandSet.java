package com.waste;

public class GetandSet {
	private int length,width;
	int getlength() {
		return length;
	}
	int getwidth() {
		return width;
	}
	public void setlength(int x) {
		length = x;
	}
	public void setwidth(int y) {
		width=y;
	}
	public int area() {
		int a=length*width;
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetandSet o1=new GetandSet();
		o1.setlength(23);
		o1.setwidth(22);
		System.out.println("length value is :"+o1.getlength());
		System.out.println("width value is :"+o1.getwidth());
		System.out.println("area of rectangle :"+o1.area());
	}

}
