import java.util.InputMismatchException;
import java.util.Scanner;

public class FIbonacci_Generator {
    // The program main method, i.e., the entry point to the program
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        int input;
        while (true) {
            // Try and catch block handles input error
            try {
                System.out.print("Enter your maximum value for the Fibonacci sequence: ");
                input = getInput.nextInt();
                if (input >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a non-negative integer, your input is invalid");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a non-negative integer, your input is invalid");
                // Takes care of invalid input
                getInput.nextLine();
            }
        }

        print_Fibonacci(input);

        getInput.close();
    }

    // The method that handles and generates the Fibonacci sequence
    public static void print_Fibonacci(int maxAllowedValue) {
        long a = 0, b = 1, c;
        int fob_sequence = 0;

        System.out.print("The Fibonacci Sequence up to " + maxAllowedValue + " is: ");

        while (a <= maxAllowedValue) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            fob_sequence++;
        }

        System.out.println("\nTerms in that range are: " + fob_sequence);
    }
}


