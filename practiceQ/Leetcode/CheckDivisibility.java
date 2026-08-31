//3622
//Given n, uske saare digits ka:
//sum nikalo
//product nikalo

import java.util.Scanner;

public class CheckDivisibility {
    public static boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int prod = 1;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            prod *= digit;
            temp = temp / 10;
        }

        return n % (sum + prod) == 0; //returns true if n is div by both sum and prod 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(checkDivisibility(n));

        sc.close();
    }
}