package com.waste;
  
class phone{
	void sum() {
		System.out.println("sum function");
	}
	void add() {
		System.out.println("adding function");
	}	
}
interface call {
	void display();
	void camera();
}
interface calling{
	void fingerprint();
	void battery();
}
class smartphone extends phone implements call,calling {

	@Override
	public void fingerprint() {
		// TODO Auto-generated method stub
		System.out.println("finger print added");
	}
	@Override
	public void battery() {
		// TODO Auto-generated method stub
		System.out.println("5000 mAh");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display 6'");
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("12 mega pixel ");
	}
	
}

public class Interpro {

	public static void main(String[] args) {
      smartphone red = new smartphone();
      red.battery();
      red.camera();
      red.fingerprint();
      red.display();
      red.sum();
      red.add();
	}

}
