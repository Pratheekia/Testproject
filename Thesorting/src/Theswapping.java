import java.util.Scanner;

public class Theswapping {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int[] arr = new int[scan.nextInt()];
 //System.out.println("Enter " + arr.length + " numbers to be stored");
        for (int i = 0; i < arr.length; i++) { //u can write the commented or after for loop statement
        	System.out.println("Enter  numbers to be stored" + (i+1));
            arr[i] = scan.nextInt();
        }

        System.out.println("enter 2 indexes to be swapped");
        int i1 = scan.nextInt(); 
        int i2 = scan.nextInt();
        int temp;
        System.out.println("Before swapping the array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        if ( i1 >= 0 && i1 <= arr.length - 1 && i2 >= 0 && i2 <= arr.length - 1) {
            temp = arr[i2];
            arr[i2] = arr[i1];
            arr[i1] = temp;

            System.out.println("After swapping the array elements are:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Enter the indexes in the range of 0 to " + (arr.length - 1));
        }
    }
}
