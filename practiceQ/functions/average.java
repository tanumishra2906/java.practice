//Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class average{
    public static int calcAvg(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int avg = calcAvg(a, b, c);
        System.out.println("average is "+avg);
    }
}