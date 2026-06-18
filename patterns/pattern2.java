//hollow rectangle
import java.util.*;

public class pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); //no of rows or width of rec
        int m= sc.nextInt(); //no of stars in each row

        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*"); 

                }
                else{
                    System.out.print(" ");
                }
                
            } 
            System.out.println();

        }
    }
}

