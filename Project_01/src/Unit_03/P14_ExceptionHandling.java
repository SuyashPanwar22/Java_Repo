package Unit_03;
import java.util.Scanner;
public class P14_ExceptionHandling {

	public static void main(String[] args) {
		
		operationOnException obj = new operationOnException();
		obj.test();
		
		obj.multipleException(0);
		obj.IndexOutofbound();
		obj.inputMismatchException();
		obj.ManualExceptionThrow();
		obj.NullPointerException();
	
	}
}
 class operationOnException
{
	 int n;
	 int x;
	 
	void test()
	{
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		try {
			x = n/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero exception");
		}
	}
	
	void multipleException(int n)
	{
		try {
			x = n/n;
		}
		catch(ArithmeticException e)
		{
			System.out.println("0/0 exception");
		}
		catch(Exception e)
		{
			System.out.println("Handling Exception");
		}
	}
	
	void inputMismatchException()
	{
		Scanner s2 = new Scanner(System.in);
		try{
			int x = s2.nextInt();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	
	void NullPointerException()
	{
		String s = null;
		try {
			System.out.println(s.length());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
	}
	
	void IndexOutofbound()
	{
		//int a[] = new int[3];
		int a[] = {1,2,4};
		
		try {
			System.out.println(a[22]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	

	void ManualExceptionThrow() {
		try
		{
			tryOurException(17);
		}
		catch(ManualException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

	void tryOurException(int x) throws  ManualException
	{
		int age = 5;
		
		if(age<18)
		{
			throw new ManualException();
		}
		System.out.println("Free to go");
	}
  
}

class ManualException extends Exception
{
	public String getMessage()
	{
		String detailMessage = "Exception here!!!!";
		return detailMessage;
	}
}