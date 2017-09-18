import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        // Declare variables
        int a, b, sum, diff, prod, quo, rem;

        // Get command line argument values
   System.out.println("Enter a number ");
   a = X.nextInt();
   System.out.println("Enter another number ");
   b = X.nextInt();

        // Find sum, difference, product, quotient and remainder
        sum = a + b;
        diff = a - b;
        prod = a * b;
        quo = a / b;
        rem = a % b;

        // print result
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + prod);
        System.out.println("Quotient = " + quo);
        System.out.println("Remainder = " + rem);
        X.close();
    }
    //2020
}