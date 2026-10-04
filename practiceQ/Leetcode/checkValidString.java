import java.util.*;
public class checkValidString {
    public static boolean checkValidString(String s) {
        int min=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            // min = minimum possible balance of '(' 
            // max = maximum possible balance of '('

            if (ch=='('){ //min max dono range inc karega
                min++;
                max++;

            }
            else if (ch==')'){
                min--;
                max--;
            }

            else{ //for *
                min--; // '*' can become ')', so minimum balance decreases
                max++;// '*' can become '(', so maximum balance increases // '*' can also be empty, which lies between min and max
            }


            // Negative minimum means some possibilities are invalid, // but other valid possibilities may still exist. // So we discard the negative part by setting min to 0.
            if(min<0){
                min=0;
            }

            if(max<0){ //agr max range 0 ho gya then toh no possiblity for string to be valid so return false
                return false;
            }
        }
        
        return min==0;  //this is whats needed balance 0 i.e koi possible permutation bn rha hoga using * where (==)
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println(checkValidString(s)); 
        sc.close(); }
}
/* The main idea is to keep a **range of possible balances** using `min` and `max`, because `*` 
can act as `(`, `)`, or an empty character. `min` 
represents the minimum possible balance and `max` represents the maximum possible balance.
 For `(`, both increase, and for `)`, both decrease. 
For `*`, we consider the minimum case as `)` 
so `min--`, and the maximum case as `(` so `max++`; the empty case is automatically
 covered between this range. If `min` becomes negative, it means some 
possibilities are invalid, but other valid possibilities may still exist, so we reset 
`min` to `0`. However, if `max` becomes negative, even the best possible choice gives 
a negative balance, meaning no valid possibility is left, so we return `false`. At the end, 
`min == 0` means that a balance of `0` is possible, so `*` can be chosen appropriately 
and the string can be made a valid parenthesis string.
 */




