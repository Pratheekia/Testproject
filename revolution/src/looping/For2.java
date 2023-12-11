package looping;

public class For2 {

	public static void main(String[] args)
	
	{
		int sum = 0;
		
		for(int i=1; i<=50; i++)
		{
			
			if(i%3==0)
				System.out.println(i);
			{
				sum+=i;
			}
		}
				System.out.println( "the sum of num from 1 to 50 which is divided by 3 is  " +sum);
		

	}
	}

