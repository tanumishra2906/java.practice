//Print  Keypad Combinations //the ones below noo.s in keypad phones
/* Subsequence: Har character ke 2 choices (Take / Don't Take).
Keypad: Har digit ke jitne letters hain utni choices. */

//here i will use a loop as var choices not just 2


import java.util.*;
public class keypadCombo {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void kpCombo(String str, int idx , String newstr){ //here new str is the required combination
        if(idx==str.length()){ 
            System.out.println(newstr);
            return;
            
        }
        String mapping = keypad[str.charAt(idx)-'0'] ;//eg 23 so curr char lets say 2....here we check which string is at this idx
        for(int i=0;i<mapping.length();i++){
            kpCombo(str, idx+1, newstr+mapping.charAt(i));//adding each letter from the mapped string
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.next();    
        kpCombo(str, 0, "");
    }

}
