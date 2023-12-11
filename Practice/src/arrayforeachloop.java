import java.util.Scanner;

public class arrayforeachloop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the element");
		int [] arr=new int[scan.nextInt()];
		for(int i=0; i<=arr.length-1; i++)
		{
			arr[i]=scan.nextInt();
		}
		 for(int x:arr)
		 {
			 x+=5;
			 System.out.println(x + " ");
		 }

	}

}
