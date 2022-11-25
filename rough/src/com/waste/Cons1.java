package com.waste;

public class Cons1 {
	public double length,breath;
	public Cons1(){
		length =2.4;
		breath=4.5;
	}
	public Cons1(double x,double y){
		length =x;
		breath=y;
	}
	public Cons1(double x){
		length=breath=2.3;
	}
	double area() {
		double a=length*breath;
	    return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Cons1 D =new Cons1();
       Cons1 D1=new Cons1(3.4,6.4);
       Cons1 D2=new Cons1(4.7);
       System.out.println(D.area());
       System.out.println(D1.area());
       System.out.println(D2.area());
	}

}
