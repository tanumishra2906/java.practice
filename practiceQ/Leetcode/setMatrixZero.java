
import java.util.*;

public class Main {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length; //mat[0] i.e row1 main jitne elem utne 

        //considering first elem to be 0;
        boolean firstRow = false;
        boolean firstCol = false;


        //1st col and first row main 0 h we are keeping in mind
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
                break;
            }
        }


//markers set karo
// Marker ka matlab hai: zero ko turant spread mat karo; 
// kisi bhi cell main 0 then pehle us zero ki row aur column par nishaan laga do, phir baad mein un nishaanon ko dekhkar zeros spread karo. set karo

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }


        //ab markers pe basis pe 0 baithao
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }


        //handle first row nd first col
        if (firstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (firstCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        setZeroes(matrix);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}


//theory
/* Sabse pehle matrix.length se rows (m) aur matrix[0].length se columns (n) nikalte hain, kyunki matrix[0] 
first row hoti hai aur uski length batati hai ki usme kitne columns hain. Phir firstRow aur firstCol naam ke do 
boolean flags lete hain, initially false, jinka kaam sirf ye remember karna hai ki original matrix ki first row 
ya first column mein zero tha ya nahi. Pehle loop se first row check karte hain; agar kahin 0 mila toh firstRow = true. 
Similarly next loop first column check karta hai aur zero milne par firstCol = true. Ab main part aata hai: hum first row aur
 first column ko markers/nishaan ki tarah use karte hain, taaki extra arrays na banane padein. Isliye inner matrix ko i=1 aur
  j=1 se traverse karte hain. Agar matrix[i][j] == 0 milta hai, toh iska matlab poori row i aur column j ko zero karna hai,
lekin abhi zero nahi karte; bas matrix[i][0] = 0 karke row i ko mark kar dete hain aur matrix[0][j] = 0 karke column j ko mark 
kar dete hain. Iske baad second nested loop in markers ko read karta hai. Agar matrix[i][0] == 0, matlab current cell ki row marked 
hai, ya agar matrix[0][j] == 0, matlab current cell ka column marked hai; dono mein se koi bhi true hua toh matrix[i][j] = 0 kar dete
    hain. Finally first row aur first column ko separately handle karte hain, kyunki unhi ko markers ke liye use kiya tha. Agar firstRow == true tha,
toh poori first row zero kar dete hain, aur agar firstCol == true tha, toh poori first column zero kar dete hain. So overall flow hai:
pehle original first row/column ki information save karo → baaki matrix mein zero dhundo → zero ki row/column ko first row/column mein marker
karo → markers ke basis par zeros spread karo → end mein first row/column ko flags ke according zero karo */