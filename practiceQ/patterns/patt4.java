package patterns;
//Inverted half pyramid

import java.util.*;

public class patt4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //no of rows 

        for(int i=n;i>=1;i--){  //decrement
            for(int j=1;j<=i;j++){ 
                System.out.print("*"); 
            } 
            System.out.println();

        }
    }
} 