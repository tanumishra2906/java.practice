//Print all unique subsequences
// egg aaa has 3 similar i.e aa subsequence now to store only unique ones i.e aa once
//we use hash set as it wont store duplicates

import java.util.*;
public class uniqueSubsequences {
    
    public static void uniqueSubsequences(String str, int idx , String newstr , HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newstr)){
                return; //if char already goes nothing happens simple return
            } 
            else{
                System.out.println(newstr);
                set.add(newstr); //add that char in the set if not already
                return;
            }
        

        }
        //2 options--- one is including the char other is excuding the char so we will have 2 recurs calls
        //to include char;
        uniqueSubsequences(str, idx+1, newstr+str.charAt(idx),set);

        //to exclude char
        uniqueSubsequences(str, idx+1, newstr,set);//new str remains as it is
         }

        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.next();
        HashSet<String> set = new HashSet<>();

        uniqueSubsequences(str, 0, "", set);

    }
    
}
