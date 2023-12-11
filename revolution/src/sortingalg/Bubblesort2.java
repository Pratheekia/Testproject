package sortingalg;

public class Bubblesort2 
{
public static int[] sort(int []arr) //while returning int of arr value,we write static int[]
	{
    	int temp;
	  for(int i=0; i<=arr.length-2;i++) //n-2
	  {
		  for(int j=0; j<=arr.length-i-2;j++) //n-i-2
		  {
			  if(arr[j]>arr[j+1])
			  {
				  temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
		  }
		  
	  }
	  return arr;
	  
   }

}
