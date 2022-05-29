package unit_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class P15_FileHandlingQues1 {

	public static void main(String[] args) {
		A obj = new A();
		try {
			obj.CountWord();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class A
{
	int ctr=0;
	void CountWord()  throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Amit\\git\\Java_repo\\Learning Java\\src\\unit_03\\output.txt"));
		
//		String s = br.readLine();
		int str;
		
		while((str=br.read())!=-1)
		{
			if(str==32|| (char)str=='\n')
				ctr++;
		}
		
		System.out.println("Total number of words are: " +ctr);
		
		br.close();
	}
}