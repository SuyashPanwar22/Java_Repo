package Unit_01;
class Student
{
	String name ;
	int roll ;
	
	Student()
	{
		name="Rashmi";
		roll=23 ;
	}
	
	Student(String nm , int rn)
	{
		name=nm ;
		roll=rn ;
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("RollNo : "+roll);
	}
}

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student rashmi=new Student();	
	Student suyash=new Student("Suyash",22);
	rashmi.display();
	suyash.display();
	}
}
