import java.util.Scanner;

public class arraypositive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the element");
		int [] arr=new int[scan.nextInt()];
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println(" array elements are");
		 for(int i=0; i<=arr.length-1; i++)
		 {
			 if(i>0);
			 System.out.println(i);
		 }

	}

}

