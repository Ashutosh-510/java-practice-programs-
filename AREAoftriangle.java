import java.util.Scanner;

public class AREAoftriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextInt();
        double height = input.nextInt();
        double AREA = ( base * height )/2;
        System.out.println(AREA);
    }
}
