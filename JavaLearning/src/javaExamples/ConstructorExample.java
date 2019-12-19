package javaExamples;

public class ConstructorExample {
	String employeename;
	int employeesid;
	ConstructorExample(String name,int id){
		employeename=name;
		employeesid=id;
		
	}
	public void employeedetails() {
		System.out.println("Display employee name:" +employeename+ "and display employee id:"+employeesid);
	}
	public void employeedetails1() {
		System.out.println("Display employee name:" +employeename+ "and display employee id:"+employeesid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample cons = new ConstructorExample("nasar",67);
	    cons.employeedetails();
	    ConstructorExample cons1 = new ConstructorExample("anush",89);
		cons1.employeedetails1();
	}

}
