package tax;
import java.util.*; //ctrl+shift+o

public class PersonDemo {

	public static void main(String[] args) {
		//create scanner object
		Scanner ob=new Scanner(System.in);
		System.out.println("enter person name");
		String name=ob.next();
		System.out.println("enter age");
		int age=ob.nextInt();
		System.out.println("enter Taxable Income.");
		int income=ob.nextInt();
		System.out.println("enter gender");
		String gender=ob.next();
		
		//person object and initialize
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		TaxCalculation tx=new TaxCalculation();
		tx.calculateTx(person);
		
		System.out.println(person);

	}

}
