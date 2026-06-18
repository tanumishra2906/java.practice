//HALF PYRAMID WITH NUMBERS

import java.util.*;

public class patt6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //no of rows or width of rec

        for(int i=1;i<=n;i++){ 

            for(int j=1;j<=i;j++){ 
                System.out.print(j); 
            } 
            System.out.println();

        }
    }
}





