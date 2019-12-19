package javaExamples;

public class SwitchConditionExample {
	String favoritecricter="virat";
	public void findfavoritecricter() {
		switch (favoritecricter) {
		case "sachin":
		System.out.println("your favorite cricter sachin");	
			break;
		case "dhoni":
			System.out.println("your favorite cricter dhoni");
			break;
		case "virat":
		System.out.println("your favorite cricter virat");
		break;
		default:
			System.out.println("sorry i am unable to find your favorite cricter");
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwitchConditionExample crickter = new SwitchConditionExample();
		crickter.findfavoritecricter();

	}

}
