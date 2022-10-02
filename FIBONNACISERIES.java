import java.util.Scanner;

public class FIBONNACISERIES {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c;
        int i = 0;
        System.out.print(a+" "+b);
        while (i<n) {
            c = a+b;
            a=b;
            b=c;
            System.out.print( " "+c);
            i++;
        }
    }
}
