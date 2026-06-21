// Insertion Sort builds the sorted array one element at a time by inserting each element into its correct position.
//leftwards shifting <<<<-----


import java.util.*;
class insertionsort{
    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){

            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;

            } arr[j+1]=temp;
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

        insertionSort(arr);
        
    }
}