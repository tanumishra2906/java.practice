//print first and last occurance 
import java.util.*;
public class findOccurrence {
    public static int first = -1; //we are considering an invalid index intead of 0 so that prog wont think char is already found at 0 index
    public static int last = -1;

    public static void findOccurrence(String str, int idx,char element){
        if(idx==str.length()){
            System.out.println("first occurrence is");
            System.out.println(first);
            System.out.println("last occurrence is");
            System.out.println(last);
            return;
        }
        if(str.charAt(idx)==element){;
            if(first==-1){ //if first occ has not been found yet update it
                first=idx;
            }
            else{
                last=idx;// update last occurrence whenever the char is found again

            }

        }
        findOccurrence(str, idx+1, element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str= sc.next();
        System.out.println("enter character whose occurrance is to be found");
        char element = sc.next().charAt(0);

        findOccurrence(str, 0 , element);

    }
    
}
