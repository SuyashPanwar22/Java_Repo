package Assignment_01;
import java.util.Scanner;
public class Q03 {

	public static void main(String[] args) {
		Testclass obj = new Testclass();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = s.nextInt();
		
		obj.display(x);
	
	}

}

interface In1
{
	public void display(int p);
}

class Testclass implements In1
{
	public void display(int p)
	{
		int c = 0;
		if(p<=1)
			System.out.println("Not Prime");
		
		for(int i=2; i<p; i++)
		{
			if(p%2==0)
			{
				c=1;
				System.out.println("Not prime");
				break;
			}
		}
		if(c==0)
			System.out.println("Prime");
	}
}