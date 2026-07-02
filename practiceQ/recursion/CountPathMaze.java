//eg theres a 3*3 maze we need to go from (0,0) to (2,2) we can only walk rightways and downwards


import java.util.*;
public class CountPathMaze {
    

    public static int countmaze(int i, int j , int n,int m){
        if(i==n || j==m){
            return 0; //no mor path left
        }
        if(i==n-1 || j==m-1){
            return 1; //boundary condition only 1 poss path either right or left
        }


        int countRight = countmaze(i+1, j, n, m); //inc count if we trvel rightways
        int countDown = countmaze(i, j+1, n, m);
        return countDown+countRight;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column");
        int n= sc.nextInt();
        int m= sc.nextInt();

        System.out.println("total no of possible path is");
        System.out.println(countmaze(0, 0, n, m));

    }
    
}