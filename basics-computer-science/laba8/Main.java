public class Main {

    public static void main(String[] args) {

        int[][] matrix = {
                {  1,  2, -3,  4 },
                {  5,  6,  7,  8 },
                { -9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int n = matrix.length;

        // -------------------------------
        // 1) Сумма столбцов без отрицательных элементов
        // -------------------------------
        int sumColumns = 0;

        for (int col = 0; col < n; col++) {
            boolean hasNeg = false;
            int sum = 0;

            for (int row = 0; row < n; row++) {
                if (matrix[row][col] < 0) {
                    hasNeg = true;
                    break;
                }
                sum += matrix[row][col];
            }

            if (!hasNeg) {
                sumColumns += sum;
            }
        }

        System.out.println("Сумма элементов столбцов без отрицательных = " + sumColumns);

        // -------------------------------
        // 2) Минимум сумм модулей диагоналей, параллельных побочной
        // -------------------------------

        int minDiagSum = Integer.MAX_VALUE;

        // Диагонали выше побочной (сдвиг j вправо)
        for (int shift = 1; shift < n; shift++) {
            int sum = 0;

            for (int i = 0; i + shift < n; i++) {
                int j = (n - 1 - i) + shift;
                if (j >= 0 && j < n) {
                    sum += Math.abs(matrix[i][j]);
                }
            }

            minDiagSum = Math.min(minDiagSum, sum);
        }

        // Диагонали ниже побочной (сдвиг j влево)
        for (int shift = 1; shift < n; shift++) {
            int sum = 0;

            for (int i = shift; i < n; i++) {
                int j = (n - 1 - i) + (shift * -1);
                if (j >= 0 && j < n) {
                    sum += Math.abs(matrix[i][j]);
                }
            }

            minDiagSum = Math.min(minDiagSum, sum);
        }

        System.out.println("Минимум среди сумм модулей диагоналей = " + minDiagSum);
    }
}
