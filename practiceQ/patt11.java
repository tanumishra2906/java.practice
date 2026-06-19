//Solid rhombus
//each patt prog look for what all to print in what order follow that order inside i loop
/*
    *****
   *****
  *****
 *****
***** 
*/
import java.util.*;

public class patt11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //no of rows in 1st part

        for(int i=1;i<=n;i++){  
            for(int spaces=1;spaces<=(n-i);spaces++){
                System.out.print(" "); 
            }
            for(int j=1;j<=5;j++){    //stars const each row
                System.out.print("*"); 
            }
            
            System.out.println();


        }
        
    }
}