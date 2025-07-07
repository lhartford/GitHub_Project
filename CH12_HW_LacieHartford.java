import java.util.Scanner; //import the scanner
import java.util.InputMismatchException; //import the input exception

public class SumTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); //To create the Scanner object to read input
        int num1=0; //The first integer
        int num2=0; //The second integer
        boolean valid=false; //is used to check if the inputs are valid

        //is the loop to get a valid first integer
        while (!valid) {
            try {
                System.out.print ("Enter the first integer: ");
                num1=scanner.nextInt(); //is used to try to read integer input
                valid=true; //if read correctly, set valid to true
            } catch (InputMismatchException e) {
                System.out.println ("That's not a valid number. Please enter an integer.");
                scanner.next(); //is used to clear the invalid input
            }
        }

        valid=false; //used to reset valid flag for second the input

        //use a loop to get valid second integer
        while (!valid) {
            try {
                System.out.print ("Enter the second integer: ");
                num2=scanner.nextInt(); //is used to try to read second integer input
                valid=true; //if ran correctly, exit the loop
            } catch (InputMismatchException e) { //catch the exception
                System.out.println ("That's not a valid number. Please enter an integer.");
                scanner.next(); //to clear the invalid input
            }
        }

        //is used to calculate the sum of the two valid integers
        int sum=num1 + num2;

        //is used to display the result to the user
        System.out.println ("The sum is: " + sum);

        scanner.close(); //close the scanner
    }
}