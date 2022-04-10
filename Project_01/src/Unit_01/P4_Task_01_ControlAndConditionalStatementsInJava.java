package Unit_01;

/*
 * 	Control Statements and Conditional Statements :
 *  - Java provides three types of control flow statements.
 *  - Decision making statements
 *  	- if statements
 *  	- switch statements
 *  
 *  - Loop statements
 *  	- do while loop
 *  	- while loop
 *  	- for each-loop
 *  - Jump statements
 *  	- break statements
 *  	- continue statements
 */

public class P4_Task_01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Statements obj=new Statements();
		
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();
	}
}

class Statements{
	
	void DecisionMakingStatements() {
		
		int x=10 ;
		int y=12 ;
		
		if(x + y < 10) {
			System.out.println("x + y is less than  10");
		}
		else
		{
			System.out.println("x + y is greater than  20");
		}
			
		int num=2 ;
		
		// can we char instead of int as num ?
		switch(num) {
		case 0: //case value 1 :
			System.out.println("number is 0");
			break ;
		case 1:
			System.out.println("number is 1");
			break ;
		default :
			System.out.println(num);
		}
	}
	
	void LoopStatements() {
		/* for(initialization, condition, increment/decrement) { // block of statements }
		 * for(data_type var : array_name/collection_name) { // statements }
		 */
		// for loop
		int sum=0 ;
		for(int j=1 ; j<=10 ; j++) {
			sum+=j ;
		}
		System.out.println("Sum of first 10 natural numbers is "+sum);
		
		// for each
		
		String[] names = {"Riya" , "C" , "C++" , "Python" ,"Javascript"};
		System.out.println("Printing the content of the array names");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		/*
		 * while (condition) { // looping statements }
		 */
		
		int i=0 ;
		System.out.println("Printing the first 10 even numbers");
		while(i<=10) {
			System.out.println(i);
			i=i + 2 ;
		}
		
		/*
		 *  do-while do { // statements while(condition) ;
		 */
		 i=0 ;
		System.out.println("Printing the first 10 even numbers");
		do {
			System.out.println(i);
			i = i + 2 ;
		} while(i <= 10);
	}
	void JumpStatements() {
		// break 
		for(int i=0 ; i<= 10 ; i++) {
			System.out.println(i);
			
			if(i==6)
				break ;
			System.out.println(i);
		}
		
		// continue 
		for(int i=0 ; i <= 10 ; i++) {
			if(i==6)
				continue ;
			System.out.println(i);
		}
	}
}
	