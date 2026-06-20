// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class oddsum{
    public static int oddSum(int n){
        int oddsum=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                oddsum=oddsum+i;
            }
        }
        return oddsum;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        
        System.out.println("sum of all odd numbers is ="+oddSum(n));
    }
}