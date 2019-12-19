package javaExamples;

public class WrapperClass {

	Long Bankaccountnumber=1234567890l;
	String Name="Nasar";
	Integer Accountbalance=10000;
	public void gettheacoountbalance() {
		System.out.println("Account Balance is: " +Accountbalance);
	}
	public void getname() {
		System.out.println("Account holder name is: " +Name);
	}
	public void getaccountnumber() {
		System.out.println("Customer Account Number is: " +Bankaccountnumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperClass details = new WrapperClass();
		details.gettheacoountbalance();
		details.getname();
		details.getaccountnumber();
	}
}
