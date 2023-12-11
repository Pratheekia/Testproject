

		import java.util.Scanner;

		public class concatarray {

			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the size of the element");
				int [] arr=new int[scan.nextInt()];
				for(int i=0; i<=arr.length-1; i++)
				{
					arr[i]=scan.nextInt();
				}
        System.out.println("enter the size of  second element");
        int [] arr1=new int[scan.nextInt()];
        for(int i=0; i<=arr.length-1; i++)
		{
			arr1[i]=scan.nextInt();
		}
        System.out.println("the array3 is");
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.println(arr1[i]+arr[i]+ " ");
        }
	}

}
