package patterns;
//diamond pattern
import java.util.*;

public class patt14{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //no of rows 

        for(int i=1;i<=n;i++){ 

            for(int spaces=1;spaces<=(n-i);spaces++){ //center allign cuz both side spaces
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){ 
                System.out.print("*"); //cuz theres a space after each num
            } 
            System.out.println();

        }

        for(int i=n;i>=1;i--){ 

            for(int spaces=1;spaces<=(n-i);spaces++){ //center allign cuz both side spaces
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){ 
                System.out.print("*"); //cuz theres a space after each num
            } 
            System.out.println();

        }
    }
}