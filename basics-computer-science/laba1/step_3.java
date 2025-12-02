public class Main {
    public static void main(String[] args) {
        // вариант 1
        int x = 2;
        int y = 6;

        int result = 2 * x + 3 * y;

        System.out.println("Результат выражения 2x + 3y = " + result);

        // пример из файла
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел от 1 до 100 = " + sum);
    }
}
