package com.accessspe;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person();
		
		Scanner sc=new Scanner(System.in);
		String  name,city;
		int age;
		System.out.println("Enter person details : Name, Age, City");
		
		name=sc.nextLine();
		age=sc.nextInt();
		sc.nextLine();
		city=sc.nextLine();
		
		p.setPersonName(name);
		p.setPersonAge(age);
		p.setPersonCity(city);
	    System.out.println("person Details name: " +p.getPersonName() + "\tAge :" +
		p.getPersonAge()+ "\tCity :" +p.getPersonCity());
	    
        System.out.println("Enter person details : Name, Age, City");
		
		name=sc.nextLine();
		age=sc.nextInt();
		sc.nextLine();
		city=sc.nextLine();
		
		Person p1=new Person(name,age,city);
	    System.out.println("person Details name: " +p.getPersonName() + "\tAge :" +
		p.getPersonAge()+ "\tVity :" +p.getPersonCity());
	    
        sc.close();
	}

}
