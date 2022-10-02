import java.util.Scanner;

public class areaofET {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        double area = (1.73 * a * a) / 4;
        System.out.println(area);
    }
}