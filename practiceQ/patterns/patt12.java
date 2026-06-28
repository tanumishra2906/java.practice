package patterns;
//num pyramid
/*    
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5  */

import java.util.*;

public class patt12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //no of rows 

        for(int i=1;i<=n;i++){ 

            for(int spaces=1;spaces<=(n-i);spaces++){ //center allign cuz both side spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ 
                System.out.print(i+ " "); //cuz theres a space after each num
            } 
            System.out.println();

        }
    }
}