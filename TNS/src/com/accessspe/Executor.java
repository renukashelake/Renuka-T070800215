package com.accessspe;

public class Executor {

	public static void main(String[] args) {
		
		Base b1=new Base();
		b1.methoddefault();
		b1.methodpublic();
		b1.methodprotected();
		// b1.methodprivate();
		
		b1.vardefault=11;
		
		b1.methoddefault();
		
		b1.varprotected=25;
		b1.methodprotected();
		
		b1.varpublic=35;
		b1.methodpublic();
		
		//instance of operator
		System.out.println(b1 instanceof Base);  //returns true or false

	   Person p=new Person();
	   
	   System.out.println(p instanceof Person);
	}

}
