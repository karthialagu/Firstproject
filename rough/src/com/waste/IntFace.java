package com.waste;

interface data {
	void sum();
	void add();
}
class  Done implements data{
   	public void sum(){
		System.out.println("adding function");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("suming function");
	}
	
}
public class IntFace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Done D =new Done();
       D.add();
       D.sum();
	}

	
	
	
}
