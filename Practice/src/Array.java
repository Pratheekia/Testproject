import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of the element");
		int [] arr = new int[scan.nextInt()];
		for(int i=0;  i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		System.out.println("the array element are:");
		for(int i=0;  i<=arr.length-1;i++)
		{
			System.out.println(arr[i] + " ");
		}
		

	}

}
