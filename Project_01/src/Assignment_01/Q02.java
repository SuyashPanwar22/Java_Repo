package Assignment_01;

public class Q02 {

	public static void main(String[] args) {
		A obj = new A();
		A obj2 = new A();
		A obj3 = new A();
		
		obj.display();
		obj2.display();
		obj3.display();
		
		System.out.println("Total calls : "+ A.a);

	}

}

class A
{
	static int a = 0;
	
	void display() {
		a++;
	}
}