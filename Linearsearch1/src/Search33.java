
public class Search33 {

  public static String linearSearch3 (int[] arr, int key) {
		for(int i=0; i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				return("key "+ key + " is found at index " + i);
				
		}
	
		}
		return("key " + key + " is not found");
	

	}

}
