package Searchingalg;

public class Search2 {

	public static String linear(int[] arr, int key) {
		 for(int i=0; i<=arr.length-1;i++)
		   {
			   if(key==arr[i]) //arr[i]=10 20 30 40 50, i=0,1,2,3,4
			   {
				  return ("Key found at index " +i);
			   }}
		  
			 return ("Key not found");
		 

	}

}
