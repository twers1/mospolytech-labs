import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = sc.nextDouble();

        double y;

        if (x < -2) {
            y = 1;
        }
        else if (x <= 2) {
            y = -Math.sqrt(4 - x * x);
        }
        else {
            y = -3;
        }

        System.out.println("f(x) = " + y);
    }
}
