package Unit_01;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		int n= arr.length;
		for(int i=0; i<n-1;i++)
		{
			for(int j=0; j<n-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int k=0; k<n;k++)
		{
			System.out.print(arr[k]+" ");
		}

	}

	void findTheDuplicateElements(int[] arr) {
		
		int n = arr.length;
		
		for(int i=0; i<n-1; i++)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.println(arr[i]);
				i++;
			}
		}
		System.out.println();
		
		
	}
	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		int n=arr.length;
		System.out.print(arr[1]);
		System.out.print(" ");
		System.out.print(arr[n-2]);
		System.out.println();
		

	}

	void leftRotationInAnArray(int[] arr) {
		int n = arr.length;
		int initial = arr[0];
		for(int i=0; i<n-1; i++)
		{
			arr[i]=arr[i+1];
		}
		arr[n-1]=initial;
		
		System.out.println();
		System.out.println();
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();

	}

	void removeElementInArray(int[] arr) {
		int n = arr.length;
		int key = 3, k=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]==key)
				{k=i;
				break;
				}
		}
		
		for(int i=k; i<n-1; i++)
		{
			arr[i]=arr[i+1];
		}
		arr[n-1]=0;
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}