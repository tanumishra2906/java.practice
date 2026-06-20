// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;



public class countnum{
    static int positive=0; //using static variable so that we can use this anywhere in this whole program
    static int negative=0;
    static int zero=0;
    public static void countNum(int n){
        if(n>0){
            positive++;
        }
        else if(n<0){
            negative++;

        }
        else{
            zero++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            
            System.out.println("enter number");
            int num = sc.nextInt();
            countNum(num);

            System.out.println("do you want to continue:--(1.yes \n 2.no");
            choice = sc.nextInt();


        }while (choice==1);
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }
}

        
        
