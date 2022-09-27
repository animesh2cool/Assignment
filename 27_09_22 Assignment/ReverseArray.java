//3. Write a Java Program to reverse the array contents.

import java.util.*;

public class ReverseArray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in); // initialize scanner class
        System.out.println("please Enter the number of elements you want to store: ");
        int n=sc.nextInt(); //store the user input in a variable
        int[] array = new int[n];
        System.out.println("Pleas Enter the elements of the array: "); 
        for(int i=0; i<n; i++)  {
            array[i]=sc.nextInt(); //store array element in array
        }
        System.out.println("Reverse Array is : ");
        for(int i=n-1;i>=0;i--)
         System.out.print(array[i] + "  ");
}
}