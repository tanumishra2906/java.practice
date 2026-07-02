//permutation of a string
//possible combination of string



import java.util.*;
public class stringPermut {
    

    public static void Permutation(String str, String permutation){
        if(str.length()==0){//no more letters left
            System.out.println(permutation);

            return;
        }
        for(int i=0;i<str.length();i++){
            char Currchar=str.charAt(i); //a from abc
            String Newstr= str.substring(0,i)+ str.substring(i+1); //store rest in a new string 
            Permutation(Newstr, permutation+Currchar);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str= sc.next();

        Permutation(str, "");

    }
    
}