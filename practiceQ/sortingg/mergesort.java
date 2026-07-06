//Divide and conquer approach
//array ko keep dividing in one one element
// time complexity i.e nlogn

import java.util.*;

public class mergesort {
    public static void conquer(int [] arr, int si,int ei,int mid){ //here we will simply use mid ka value so pass it as an arg
        int[] merge = new int[ei-si+1]; //size of merged arr is ei-si+1
        int idx1= si; //1st divided arr to be merged
        int idx2 = mid+1;
        int x=0 ; 
        
        while (idx1 <=mid && idx2<=ei) {
            if(arr[idx1]<=arr[idx2]){
                merge[x]=arr[idx1]; //elem at idx1 is smaller so merge it in new arr
                x++;idx1++;
            }
            else{
                 merge[x]=arr[idx2]; 
                x++;idx2++;
            }
        }
//now theres a possibility that either arr1 ya arr 2 main elem left so un sab ko merge
        while(idx1<=mid){
            merge[x]=arr[idx1];
            x++;idx1++;
        }
        while(idx2<=ei){
            merge[x]=arr[idx2];
            x++;idx2++;
        }

    //merge is a temp array so copy these into org arra
    for(int i = 0, j = si; i < merge.length; i++, j++){
    arr[j] = merge[i];
    }
    


            

    }

    public static void divide (int[] arr,int si,int ei){ //here we need to calc mid so we cant pass it simply

        if(si>=ei){
            return; //base case i.e single elem tak divided further not possible
        }
        int mid = si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei); //on dividing the arr mid+1 becomes si for arr2
        //call conquer func after arr has been divided
        conquer(arr, si, ei, mid);




    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        System.out.println("enter elements of array");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        divide(arr, 0, n-1);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }System.out.println();
    }

    
}
