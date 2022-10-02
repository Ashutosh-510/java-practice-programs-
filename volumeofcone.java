// Volume Of Cone Java Program
import java.util.Scanner;

public class volumeofcone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        double h = in.nextDouble();
        double V = (3.14*r*r*h)/3;
        System.out.println(V);

    }
}
