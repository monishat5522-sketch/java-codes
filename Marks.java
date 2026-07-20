import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] subject = new String[n];
        int[] marks = new int[n];

        System.out.println("Enter subject names and marks:");

        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subject[i] = sc.nextLine();

            System.out.print("Marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine(); 
        }

        System.out.println("\nSubject Marks:");
        for (int i = 0; i < n; i++) {
            System.out.println(subject[i] + " = " + marks[i]);
        }
    }
}
