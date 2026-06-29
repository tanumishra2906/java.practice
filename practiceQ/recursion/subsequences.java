//print all subsequences
//removing char from str keeping order for the rest char same

import java.util.*;
public class subsequences {
    
    public static void subsequences(String str, int idx , String newstr){
        if(idx==str.length()){ 
            System.out.println(newstr);
                return;

        }
        //2 options--- one is including the char other is excuding the char so we will have 2 recurs calls
        //to include char;
        subsequences(str, idx+1, newstr+str.charAt(idx));

        //to exclude char
        subsequences(str, idx+1, newstr);//new str remains as it is
         }

        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.next();

        subsequences(str,0, "");

    }
    
}


/* Each character has two choices: include it or exclude it. Therefore, the recursion tree has o(2^n)
branches, so the time complexity is O(2^n) */