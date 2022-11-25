package com.waste;

//  -----------base class---------

class Father{  
	public void house() {
		System.out.println("have a own house ");
	}
} 

//  --------derived class--------- 

class Son extends Father  { 
	public void car ()
{
	System.out.println("have a audi car");
		}
}

public class Rextends {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Son V=new Son();
        V.car();
        V.house();
        
	}

}
