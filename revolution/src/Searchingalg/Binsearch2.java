package Searchingalg;

public class Binsearch2 {

	public static String searching(int arr[], int key)
	{
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		
		while(low<=high)
		{
			if(key==arr[mid])
			{
				return("Key " +key + " is found at index" + mid );
				
			}
			else if(key>=arr[mid])
			{
				low=mid+1;
				high=high;
				mid=(low+high)/2;
			}
			else
			{
				low=low;
				high=mid-1;
				mid=(low+high)/2;
			}
			
		}
		return("Key not found");

	}

}
