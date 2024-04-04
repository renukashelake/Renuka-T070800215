package constructor;

import java.util.Scanner;

public class ConstructorDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("Enter Customer id:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter customer name");
		name=sc.nextLine();
		System.out.println("Enter customer city:");
		city=sc.nextLine();
		System.out.println("");
        
		Customer c1=new Customer(); //default
		
		c1.setCustomerid(id);
		c1.setCustomerName(name);
		c1.setCustomerCity(city);
		System.out.println(c1);
		
		System.out.println("Enter Customer id:");
		id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter customer name");
		name=sc.nextLine();
		System.out.println("Enter customer city:");
		city=sc.nextLine();
		System.out.println("");
		
		Customer c2=new Customer(name,id,city);
				System.out.println(c2);
		
	}

}
