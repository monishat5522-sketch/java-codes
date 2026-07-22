public class NumberPattern {
    public static void main(String[] args) {

        int n = 4;
        int num = 1;

        for (int i = 1; i <= n; i++) {

            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
