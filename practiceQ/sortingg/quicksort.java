//Pivot & Partition
//we select a pivot and compare rest of the elem with pivot and place it either before or after
/* Choose Pivot
      ↓
Check every element
      ↓
Small elements → Left
Large elements → Right
      ↓
Finally Pivot ko beech me rakh do
      ↓
Recursively left aur right ko sort karo */

import java.util.*;

public class quicksort {
    public static int partition(int[] arr , int low , int high ){
        int pivot = arr[high]; //set last elem as pivot
        int i= low-1; //initiay i=-1 cuz we assume no eem is before pivot...this acts as boundary i.e i index tak smaaler elem have been found

        //traversing from low to high-1
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){ //found a smaller elem in sab ko pivot ke left side put 
                i++; 
                int temp = arr[i];
                arr[i]=arr[j]; //small wale elem i.e arr[j] ko boundary ke andar daal dia
                arr[j]=temp; 
            }
        }

        //placing pivot element in the correct position  
        i++; 
        int temp = arr[i];
        arr[i]=arr[high]; //if there's any larger element than pivot swap it 
        arr[high]=temp;
        return i;
    }

    public static void quickSort(int[] arr , int low , int high){
        if(low<high){
            int pivotidx= partition(arr, low, high);
            quickSort(arr, low, pivotidx-1); //sort left array
            quickSort(arr, pivotidx+1 , high); //sort right array
        }
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

        quickSort(arr, 0, n-1);

        System.out.println("Sorted array is");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    
}