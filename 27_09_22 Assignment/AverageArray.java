//1.Java Program to find average of an int Array.

import java.util.*;

public class AverageArray {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in); // initialize scanner class
        System.out.println("please Enter the number of elements you want to store: ");
        int n=sc.nextInt(); //store the user input in a variable
        int[] array = new int[n];
        System.out.println("Pleas Enter the elements of the array: "); 
        for(int i=0; i<n; i++)  {
            array[i]=sc.nextInt(); //store array element in array
        } 
        int sum = 0;
        for (int i=0; i<n; i++) {    //logic to sum of array elemnts
            sum += array[i];
        }
        double average = sum/n; // average of sum
        sc.close();
        System.out.println("Average of the Array is : "+ average);
}
}
