package Arrayprograms;
import java.util.Scanner;

public class Arraylinearsearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
   System.out.print("Enter the number of elements in the array: ");
      for (int i = 0;  i<=arr.length-1; i++) {
            arr[i] = scan.nextInt();
        }

        // Input the element to search for
        System.out.print("Enter the element to check which is present in an array");
        int ele=scan.nextInt();
        Arraybro1  a =new Arraybro1 ();
       a.array1(ele,arr);
    }}
        