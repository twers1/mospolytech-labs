import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] alpha = new double[5];

        System.out.println("Введите 5 значений α (в радианах):");

        // Ввод через for
        for (int i = 0; i < 5; i++) {
            System.out.print("α[" + (i + 1) + "] = ");
            alpha[i] = sc.nextDouble();
        }

        System.out.println("\n--- Результаты ---");

        int index = 0;

        // Обработка через while
        while (index < 5) {
            double a = alpha[index];

            double z1 = 1 - 0.25 * Math.pow(Math.sin(2 * a), 2) + Math.cos(2 * a);
            double z2 = Math.pow(Math.cos(a), 2) + Math.pow(Math.cos(a), 4);

            System.out.printf("α = %.5f | z1 = %.5f | z2 = %.5f%n", a, z1, z2);

            index++;
        }

        // do-while — чисто показать, что он есть
        int x = 0;
        do {
            System.out.println("\nЦикл do-while сработал!");
            x++;
        } while (x == 0);
    }
}
