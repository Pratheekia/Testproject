public class Searchbinary {
public static  void search2 (int [] arr, int key)
       {
		    int low=0;
			int high =arr.length-1;
			int mid =(low+high)/2;
			
			while(low<=high)
			{
				if(key==arr[mid])
				{
					System.out.println("key "+key+" found at index: " +mid);
					return;
				}
				else if (key>arr[mid])
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
			
			System.out.println("key not found");
		
		}
		
	}
	

