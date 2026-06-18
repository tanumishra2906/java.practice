/* inverted by 180 pyramid
   *
  **
 ***
**** 
*/

import java.util.*;

public class pattern5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //no of rows or width of rec

        for(int i=1;i<=n;i++){ 

            for(int spaces=1;spaces<=n-i;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){ 
                System.out.print("*"); 
            } 
            System.out.println();

        }
    }
}

