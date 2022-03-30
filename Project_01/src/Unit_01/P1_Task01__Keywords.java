package Unit_01;

/*
 *  - 50 such keywords [reserved words] ,meanings are defined by the
 *  - 48 + 2
 *  - 48 use
 *  - 2 for future use [goto* , 
 *  
 *  Future use : [goto* , const*]
 *  1.2V : assert**
 *  1.4V : strictfp***
 *  5.0V : enum****
 *  
 *  - Keywords : can not be used as identifiers in Java 
 *  - object
 *  - function
 *  - class
 *  - etc.
 *  
 * */

public class P1_Task01__Keywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(P1_Task02_ConstantsInJava.Pi);
		// variable name
		//Syntax error on token "double" , invalid VariableDeclaration
		int double=12 ;
		//function name
		int new() {
			//sysout[ctrl+ space]
			System.out.println();
			
			return 0 ;
		}
		
		int a=10 ;
		a=11 ;
		
		//class name [Given below]
		
		//object
		//object name can never be any keywords in Java
		ABC int=new ABC();
		//obj.display();

	}

}

//class name can never be a keyword in Java

class int{
	
}