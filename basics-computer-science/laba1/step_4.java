public class Main {
    public static void main(String[] args) {
        // вариант 3 
        int x = 4;
        int y;

        if (x < 6) {
            int sum = 0;
            for (int i = 7; i <= 17; i++) {
                sum += i;
            }
            y = sum;
        } else {
            y = 45;
        }

        System.out.println("y = " + y);
    }
}
