package patterns;
//butterfly pattern (break in 4 parts)
/* 
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        * */
import java.util.*;

public class patt10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //no of rows in 1st part

        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=i;j++){ 
                System.out.print("*"); //first print stars
            } 
            for(int spaces=1;spaces<=2*(n-i);spaces++){
                System.out.print(" "); //then print spaces
            }
            for(int j=1;j<=i;j++){ 
                System.out.print("*"); //then again print stars
            } System.out.println();


        }
        for(int i=n;i>=1;i--){ 
            for(int j=1;j<=i;j++){ 
                System.out.print("*"); //first print stars
            } 
            for(int spaces=1;spaces<=2*(n-i);spaces++){
                System.out.print(" "); //then print spaces
            }
            for(int j=1;j<=i;j++){ 
                System.out.print("*"); //then again print stars
            } 


            System.out.println();

        
        }
    }
}

