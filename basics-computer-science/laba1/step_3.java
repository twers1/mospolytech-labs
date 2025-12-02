public class Main {
    public static void main(String[] args) {

        int x = 2;   // значение из варианта 1
        int y = 6;   // значение из варианта 1

        int result = 2 * x + 3 * y; // само выражение

        System.out.println("Результат выражения 2x + 3y = " + result);

        // Доп — пример цикла: сумма от 1 до 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 1 до 100 = " + sum);
    }
}
