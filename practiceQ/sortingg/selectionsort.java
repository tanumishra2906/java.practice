//fetch min elem and place it in its coreect position ....one swap per pass

import java.util.*;
class selectionsort{
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            } 
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

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

        selectionSort(arr);
        
    }
}


