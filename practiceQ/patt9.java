/* 
1
01
101
0101
10101 */

//one uproach is to visualise each elem as a cell matrix form and giving each cell a coord starting from (1,1)
//then analyse the factors such as sum of each cell
import java.util.*;

public class patt9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int number=1;

        for(int i=1;i<=n;i++){ 

            for(int j=1;j<=i;j++){  //no of elem to be in each row 
                int sum =i+j;
                if(sum%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            } System.out.println();


        }
    }
} 