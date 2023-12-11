
public class Search1 {

	public static  void searchLinear (int[] arr, int key) {
		for(int i=0; i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
			System.out.println("key"+ key + " is found at index " + i);
				return;
		}
	
		}
		System.out.println("key " + key + " is not found");
	
	}
	}

