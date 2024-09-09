import java.util.Scanner;

public class IT24101258Lab6Q3 {
    public static void main(String[] args) {
       input Scanner  = new Scanner(System.in);
       int count = 0;
       double sumOfSquares = 0.0;

       System.out.println("Enter positive integers (terminate input with -99):");

       while (true) {
           System.out.print("Enter a number: ");
           int number = input.nextInt();

           if (number == -99) {
                break; 
            }

           if (number < 0) {
               System.out.println("Invalid input. Please enter a positive integer or -99 to terminate.");
               continue; 
            }

           sumOfSquares += number * number;
           count++;
        }

       if (count > 0) {
           double rms = Math.sqrt(sumOfSquares / count);
           System.out.printf("The Root Mean Square (RMS) is: %.10f%n", rms);
        } else {
            System.out.println("No valid numbers were entered.");
        }
    }
}