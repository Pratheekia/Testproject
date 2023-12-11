import java.util.Scanner;

public class Arrayswap {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println(" enter the size of an array");
	int [] arr=new int[scan.nextInt()];
	for(int i =0; i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();
		}
       System.out.println("enter thev index to be swapping");
       int i1=scan.nextInt();
       int i2=scan.nextInt();
       int temp;
       System.out.println("before swapping thye element");
       for(int i =0; i<=arr.length-1;i++)
       {
    	   System.out.println(arr[i] + " ");
       }
       if(i1>0 && i1<=arr.length-1 && i2>0 && i2<=arr.length-1)
       {
    	   temp=arr[i2];
    	   arr[i2]=arr[i1];
    	   arr[i1]=temp;
       }
       System.out.println("after the swapping the element");
       for(int i =0; i<=arr.length-1;i++)
       {
    	   System.out.println(arr[i] + " "); 
       }
	}

}
