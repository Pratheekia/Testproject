
public class Bubblesort1App {

	public static int[] bubbleSorting(int [] arr) {
		int temp;
		//picking every element of an array
		 for(int i=0;i<=arr.length-2;i++) {
			 //comparing the element with the next element index
			 for(int j=0;j<=arr.length-i-2;j++) {
				 if(arr[j] > arr[j+1])
				 {
	 //if element is greater than next element then swap
					 temp=arr[j+1];
					 arr[j+1]=arr[j];
					 arr[j]=temp;
					 
				 }
				 
			 }
			 
		 }
		 return arr;
	}
}
