import java.util.Scanner;

public class Calculator {
    static double squareRoot(double n) { // function to find the square root of a number
        return Math.sqrt(n);
    }

    static double factorial(double n) { // function to find the factorial of a number
        try { // for handling the case when we pass a negative number as input
            if (n < 0)
                throw new ArithmeticException(); // throwing the Arithmetic Exception
        } catch (ArithmeticException e) { // catching the exception
            return Double.NaN; // returning NaN
        }

        double answer = 1;
        for(int i = 2; i <= n; i++)
            answer *= i;
        return answer;
    }

    static double logarithm(double n) { // function to find the log base e value of a number
        return Math.log(n);
    }

    static double power(double X, double b) { // function to find X power b
        return Math.pow(X, b);
    }

    public static void main(String[] args) {
        int choice, flag = 0;
        double n1, n2;
        Scanner scan = new Scanner(System.in); // creating new scanner class object
        System.out.println("Mini Project -> Calculator using DevOps\n");

        while(flag == 0) {
            System.out.println("1. Square root\n2. Factorial\n3. Natural Logarithm (base e)\n4. Power function (X^b)\n5. Exit\n");
            System.out.print("Enter your choice :: ");
            choice = scan.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter the number :: ");
                    n1 = scan.nextDouble();

                    System.out.println("Square root of " + n1 + " = " + squareRoot(n1));
                    break;

                case 2:
                    System.out.print("Enter the number :: ");
                    n1 = scan.nextDouble();

                    System.out.println("Factorial of " + n1 + " = " + factorial(n1));
                    break;

                case 3:
                    System.out.print("Enter the number :: ");
                    n1 = scan.nextInt();

                    System.out.println("Natural Log(base e) of " + n1 + " = " + logarithm(n1));
                    break;

                case 4:
                    System.out.print("Enter X :: ");
                    n1 = scan.nextDouble();
                    System.out.print("Enter b :: ");
                    n2 = scan.nextDouble();

                    System.out.println(n1 + " power " + n2 + " = " + power(n1, n2));
                    break;

                case 5:
                    System.out.print("thank for using the program... exiting now...");
                    flag = 1;
                    break;

                default:
                    System.out.println("invalid choice... try again...");
            }

            System.out.println(); // printing new line
        }
    }
}