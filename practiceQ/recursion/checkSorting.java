//check whter an array is sorted or not
import java.util.*;
public class checkSorting {
    
    public static boolean checkSorting(int arr[], int idx){
        if(idx==arr.length-1){ 
            return true;
        }
        if(arr[idx+1]>arr[idx]){;
            return checkSorting(arr, idx+1);//call for next index jab tak condition is true
        }
        else{
            return false;
        }

        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        System.out.println("enter elements of array");

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(checkSorting(arr, 0));

    }
    
}