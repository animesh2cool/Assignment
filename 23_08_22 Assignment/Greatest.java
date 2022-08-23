// Take three numbers from the user and print the greatest number.
import java.util.Scanner;
public class Greatest {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st number: ");
        int input1 = in.nextInt();
        System.out.print("Input 2nd number: ");
        int input2 = in.nextInt();
        System.out.print("Input 3rd number: ");
        int input3 = in.nextInt();

        if(input1 >= input2) {
            if(input1 >= input3)
                System.out.println(input1 + " is the Greatest number.");
            else
                System.out.println(input3 + " is the Greatest number.");
        } else {
            if(input2 >= input3)
                System.out.println(input2 + " is the Greatest number.");
            else
                System.out.println(input3 + " is the Greatest number.");
        }
    }
}