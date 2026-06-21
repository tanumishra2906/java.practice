//BUBBLE SORT (complexity On^2)
//adjacent elem ko compares and if prev elem greater then swaps....multiple execution pass 

import java.util.*;
class bubblesort{
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.println("Sorted array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
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

        bubbleSort(arr);
        
    }
}