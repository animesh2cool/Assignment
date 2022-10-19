// 18th october class assignment

import java.util.*;

public class Mismatch {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);                       // creating scanner object
        try { 
            System.out.println("Enter two integers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
            } 
        catch (InputMismatchException e) {                         // InputMismatch Exception block
            System.out.println(e.getClass().getName()); 
            } 
        catch (ArithmeticException e) {                             // Arithmetic Exception block
            System.out.println(e.getMessage() + " error occured");
            }
    }
}
