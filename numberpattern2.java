public class Pattern2 {
    public static void main(String[] args) {

        int n = 4;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            if (i % 2 != 0) {
                // Odd rows
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
            } else {
                // Even rows
                int temp = num + i - 1;

                for (int j = 1; j <= i; j++) {
                    System.out.print(temp + " ");
                    temp--;
                }

                num = num + i;
            }

            System.out.println();
        }
    }
}
