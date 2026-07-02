//place 1*m tiles in n*m floor

import java.util.*;
public class Tiles {
    

    public static int tilesplace(int n,int m){
        if(n==m){
            return 2; //only 2 ways to place tiles both horiz or both tiles vert
        }
        if(n<m){
            return 1; //we can only place tiles horizontally
        }


        int countVert = tilesplace(n-m, m); //suppose m rows filled m-1 left
        int counthoriz = tilesplace(n-1, m); //one whole row is covered if we are placing tile horiz
        return countVert+counthoriz;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column");
        int n= sc.nextInt();
        int m= sc.nextInt();

        System.out.println("total no of possible way is");
        System.out.println(tilesplace(n, m));

    }
    
}
