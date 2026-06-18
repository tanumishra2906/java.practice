//inverted half pyramid with num

import java.util.*;

public class patt7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //no of rows 

        for(int i=n;i>=1;i--){ 

            for(int j=1;j<=i;j++){  //or we can keep i same and j =1 to n-i+1
                System.out.print(j); 
            } 
            System.out.println();

        }
    }
} 