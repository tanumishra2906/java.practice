import java.util.*;
public class nQueens {
    public static boolean isSafe(char[][] board , int row , int col){
        //we are  placing queens one by one in each row now so we will check upper col , both side diagonals
        //only upper cols and not lower ones because queens milne ki possibiity upar hi ho skti h neeche ab tak gye hi nhi h

        //for upper col
        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //for left diag 
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //for right diag
        for(int i=row,j=col;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        } 
        return true;       
    }

    public static void nQueens(char[][] board , int row){

        if(row==board.length){
            printBoard(board);
            System.out.println();
            return;
        }
        //place q in each col and fix row 
        for(int col=0; col<board.length ; col++){
            if(isSafe(board, row, col)){
                board[row][col]='Q'; //place q in each col
                nQueens(board, row+1); //recursion
                board[row][col]='X'; //backtracking i.e undo step when needed
            }
        }
    }

    public static void printBoard(char[] [] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++ ){
                System.out.print(board[i][j]+" ");
                
            }System.out.println();
        }
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column");
        int n = sc.nextInt();
        char[][] board = new char[n][n];

        //intialising board

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++ ){
                board[i][j]='X';
            }

        }

        nQueens(board, 0);
    }
}
    