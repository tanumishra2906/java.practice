import java.util.*;
public class removeDuplicates {
    static boolean map[]= new boolean[26]; //maps whether each element is present more than once or not...initially java stores false for each
    
    public static void removeDup(String str, int idx , String newstr){
        if(idx==str.length()){ 
            System.out.println("new string is");
            System.out.println(newstr);
            return;

        }
         
        if(map[str.charAt(idx)-'a']==true){ //returns true only when that char has already arrived once 
            removeDup(str, idx+1, newstr);  //here we skip that char and go for our next call

        }else{
            newstr+=str.charAt(idx); //Else if the condition is false i.e no rep of this char has been found yet so add this in the new str
            map[str.charAt(idx)-'a']=true ; //set map to true so that it can skip this char in next call

            removeDup(str, idx+1, newstr);
        }
            
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.next();

        removeDup(str,0, "");

    }
    
}
