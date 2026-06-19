//Palindromic pattern
/*  1
   212
  32123
 4321234
543212345
 */


import java.util.*;

public class patt13{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of pattern :");
        int n= sc.nextInt(); //no of rows 

        for(int i=1;i<=n;i++){ 

            for(int spaces=1;spaces<=(n-i);spaces++){ //center allign cuz both side spaces
                System.out.print(" ");
            }

            //1st half numbers
            for(int j=i;j>=1;j--){ 
                System.out.print(j); 
            }

            //2nd half numbers
            for(int j=2;j<=i;j++){ 
                System.out.print(j); 
            }

            System.out.println();

        }
    }
}