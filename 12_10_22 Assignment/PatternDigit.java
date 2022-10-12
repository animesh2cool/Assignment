/*3. Write a program to print following :
 * 1
 * 212
 * 32123
 * 4321234
 * 543212345
 */

public class PatternDigit {
    public static void main(String[] args) {
        int num = 5;
        for (int i=1;i<=num;i++) {

            for (int j=i;j>=1;j--) {
                System.out.println(j);
            }
            for (int k=2;k<=i;k++) {
                System.out.println(k);
            }
            System.out.println();
        }
    }
}
