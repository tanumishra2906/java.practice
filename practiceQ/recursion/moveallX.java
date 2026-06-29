// Move all 'x' to the end

import java.util.*;
public class moveallX {
    
    public static void moveallX(String str, int idx , String newstr,int count){
        if(idx==str.length()){ 
            System.out.println("new string is");
            for(int i=0;i<count;i++){
                newstr += 'x';
            }
                System.out.println(newstr);
                return;

        }
         
         if(str.charAt(idx)=='x'){
            count++;  //dont print x now just store its count
            moveallX(str, idx+1, newstr, count);
         }
         else{
            newstr+=str.charAt(idx); //if char is not x add it in the new str
            moveallX(str, idx+1, newstr, count);
         }

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.next();

        moveallX(str,0, "", 0);

    }
    
}