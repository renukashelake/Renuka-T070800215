package encapsulation;

public class MainDemo {

	public static void main(String[] args) {
		
		//object creation
		OOPsCenceptDemo obj=new OOPsCenceptDemo();
		obj.setAge(23);
		obj.setName("Renu");
		obj.setSerialNum(1234);
		System.out.println(obj);
		
		System.out.println("name" + obj.getName()+"serialNum"+ obj.getSerialNum()+"age:"+obj.getAge());

	}

}
