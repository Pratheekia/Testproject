import java.util.Scanner;

public class Arraypostand0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the element");
		int [] arr=new int[scan.nextInt()];
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println(" array elements are");
		 for(int x:arr)
		 {
			 if(x>0);
			 {
			 System.out.println(x);
		 }
			 else
		 {
			 System.out.println("0");
		 }
	}

}

}