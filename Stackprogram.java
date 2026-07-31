import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        int[] stack = new int[size];
        int top = -1;
        int choice;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (top == size - 1) {
                        System.out.println("Stack Overflow");
                    } else {
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();
                        top++;
                        stack[top] = value;
                        System.out.println(value + " inserted");
                    }
                    break;

                case 2:
                    if (top == -1) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println(stack[top] + " removed");
                        top--;
                    }
                    break;

                case 3:
                    if (top == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Top element = " + stack[top]);
                    }
                    break;

                case 4:
                    if (top == -1) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack elements:");
                        for (int i = top; i >= 0; i--) {
                            System.out.println(stack[i]);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Program ended");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
