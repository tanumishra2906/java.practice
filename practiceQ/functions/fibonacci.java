//Write a program to print Fibonacci series of n terms where n is input by user

import java.util.*;

public class fibonacci{
    public static void fibonacci(int n){
        int term1=0;
        int term2=1;
        
        for(int i=1;i<=n;i++){
            System.out.println(term1 + " ");
            int temp=term1+term2;
            term1=term2;
            term2=temp;


        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of terms");

        int n = sc.nextInt();
        

  
        fibonacci(n);
    }
}