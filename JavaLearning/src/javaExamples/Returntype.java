package javaExamples;

public class Returntype {
	
	public Integer pendingamount=2000;
	
	public Integer goandcollectmoney() {
		System.out.println("Go collect money from nasar: " +pendingamount+  "and amount collected and sent to you");
		return pendingamount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Returntype type = new Returntype();
		Integer amount = type.goandcollectmoney();
		System.out.println("Amount is received: "+amount);
    
	}

}
