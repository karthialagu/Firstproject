package com.waste;

abstract class mobile{
	abstract void camera ();
	abstract void display();
}
class samsung extends mobile {
	void name() {
		System.out.println("-------SAMSUNG------");
	}
	void camera() {
		System.out.println("16 mega pixel camera");
	}
	void display() {
		System.out.println("8.6' display");
	}
}
class nokia extends mobile {
	void name() {
		System.out.println("------NOKIA-----");
	}
	void camera(){
		System.out.println("8 mega pixel caera");
	}
	void display(){
		System.out.println("12.5' display");
	}
	void fingerPrint() {
		System.out.println("finger print added");
	}
}

public class Abscls {

	public static void main(String[] args) {
        samsung su=new samsung();
        su.name();    
        su.camera();
        su.display();
        System.out.println("++++++++++++++++++++++++++++");
        nokia no=new nokia();
        no.name();   
        no.camera();
        no.display();
        no.fingerPrint();
	}

}
