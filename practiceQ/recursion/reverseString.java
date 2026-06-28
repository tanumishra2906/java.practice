
import java.util.*;

public class reverseString {
    public static void revString(String str,int idx){
        if(idx==0){ //base case
            System.out.println(str.charAt(idx));
            return;
            
        }
        
        System.out.print(str.charAt(idx));
        revString(str, idx-1); //recursive call 
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter string");
            String str = sc.next();
            System.out.println("reversed string is");
            revString(str, str.length()-1);  //we are passing last index initially
        }
    
}
