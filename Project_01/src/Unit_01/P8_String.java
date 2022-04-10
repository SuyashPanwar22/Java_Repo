package Unit_01;

/* Problem Statement:
P8_String: 
(Create separate logic in separate function)
F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.
F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?
 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75455");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		
		int i=0,ctr=1;
		String Rstr = "";
		int length = s.length();
		int j= length -1;
		
		
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
				{System.out.println("String is Not palindrome");
				ctr++;
				break;
			}
				i++;
				j--;
		}
		if(ctr == 1) {
		System.out.println("String is Palindrome");}
	}

	void reverseOfAString(String s) {
		int length = s.length();
		char[] Rstr = new char[10];
		for(int i=length-1,j=0; i>=0; i--,j++) {
			Rstr[j]= s.charAt(i);
			}
		for(int i=0; Rstr[i]!='\0'; i++)
		{
			System.out.println(Rstr[i]);
		}
	}
	
	void stringEqualOrNot(String s1,String s2) {
		int ctr=0; 
		for(int i=0; i< s1.length() && i<s2.length(); i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
				ctr++;
		}
		if(ctr==s1.length() && ctr == s2.length())
			System.out.println("Same");
		else
			System.out.println("Different");
	}
}
