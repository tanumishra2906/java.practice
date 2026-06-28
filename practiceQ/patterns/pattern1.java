package patterns;
//solid rectangle star pattern

import java.util.*;

public class pattern1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //no of rows or width of rec
        int m= sc.nextInt(); //no of stars in each row

        for(int i=1;i<=n;i++){ //for each row
            for(int j=1;j<=m;j++){ //for each elem in a row
                System.out.print("*"); //no ln cuz * ek hi line main print krwana h
            } 
            System.out.println();

        }
    }
}