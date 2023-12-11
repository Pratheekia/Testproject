package sortingalg;

public class Selectionsort2 {

	public static int [] sort(int [] arr)
	{
		for(int i=0; i<=arr.length-2;i++)
		{
			  int min=arr[i];
		      int pos=1;
		  {
			  for(int j=i+1; j<=arr.length-1;j++)
			  {
				  if(arr[j]<min)
				  {
					  min=arr[j];
					  pos=j;
				  }
			  }
			  int temp;
			  temp=arr[i];
			  arr[i]=arr[pos];
			  arr[pos]=temp;
					  
			  
		  }
		  
		  
	   }
		return arr;
	}}

		
