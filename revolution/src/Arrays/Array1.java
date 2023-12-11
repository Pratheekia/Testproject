package Arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the num of passengers");
		  int n=scan.nextInt();
		 
		  int []  arr= new int [n];
		  for(int i=0; i<=arr.length-1; i++)
		{
	           System.out.println("Enter the weight of  passenger" +i+1);
	              arr[i]=scan.nextInt();
	              
	              
		}
		  int sum=0;
		  for(int i=0; i<=arr.length-1; i++)
		  {
			  sum=sum+arr[i];
		  }
		  if(sum<=800)
		  {
		  System.out.println(" Lift will work");
		  }
		  else
		  {System.out.println("not work");
		  
		
		  }
	}

}
