package usingobject;//created package as usingobject

public class Student {//created class as student
	int id=10;//initalizng id
	String name="Vamshi";//taking name

	public static void main(String[] args) {
		
		Student s1=new Student();//creating an object of Student  
		System.out.println("print the value of id: " +s1.id); //here print the value of id with the refrence of object 
		System.out.println("print the value of name: " + s1.name); //here print the value of name with the refrence of object 
		
		s1.id=20;//here we are changing the value of id
		s1.name="Krishna";//here we are changing the value of id
		
		System.out.println("print the value of id: " +s1.id); //here print the changing value of id with the refrence of object 
		System.out.println("print the value of name: " + s1.name); //here print the value of id with the refrence of object

	}

}