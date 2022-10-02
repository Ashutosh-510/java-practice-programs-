import java.util.Scanner;

public class Leetcode1281 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long product = 1;
        long sum = 0;
        while (n>0) {
            int rem = n%10;
            n/=10;
            product = product* rem ;
            sum = sum + rem;
            System.out.print(" "+product);
            System.out.print(" "+sum);

        }

        System.out.println(" "+(product-sum));
    }
}
