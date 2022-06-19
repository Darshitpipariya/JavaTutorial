package co.darshit;
//encapsulation -> binding data with method
//access class variable using get & set methods
class Student{
	private int rollno;
	private String name;
	//getter and setter
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class EncapsulationDemo{
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setRollno(0);
		s1.setName("Darshit");
		System.out.println(s1.getName());
		System.out.println(s1.getRollno());
	}
}