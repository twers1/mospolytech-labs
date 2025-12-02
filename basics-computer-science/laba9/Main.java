import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите номер столбца: ");
            int column = sc.nextInt();

            // Проверка: существует ли столбец?
            if (column < 0 || column >= matrix[0].length) {
                System.out.println("Ошибка: столбца с таким номером не существует!");
                return;
            }

            // Вывод столбца
            System.out.println("Столбец № " + column + ":");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][column]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: нужно вводить ЧИСЛО, а не строку!");
        }
    }
}
