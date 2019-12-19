package javaExamples;

public class IfelseifExample {
	
	String mysuperhero="vijay";
	public void guesssuperhero() {
		if(mysuperhero.equals("rajini")) {
			System.out.println("your super hero is rajini");
		}
		else if(mysuperhero.equals("ajith")){
			System.out.println("your super hero is ajith");
		}
		else if(mysuperhero.equals("vijay")){
			System.out.println("your super hero is vijay");
		}
		else {
			System.out.println("Sorry i am unable to guess your super hero");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfelseifExample guess = new IfelseifExample();
		guess.guesssuperhero();
	}

}
