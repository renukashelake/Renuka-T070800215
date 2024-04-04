package constructor;

public class Customer {
	
	private String customerName;
	private int customerid;
	private String customerCity;
	
	//default
	public Customer()
	{
		System.out.println("Default constructor");
	}
	//parameter

	public Customer(String customerName, int customerid, String customerCity) {
		super();
		this.customerName = customerName;
		this.customerid = customerid;
		this.customerCity = customerCity;
	}
	//getter and setter

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	//Tostring

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerid=" + customerid + ", customerCity="
				+ customerCity + "]";
	}
	

	

}
