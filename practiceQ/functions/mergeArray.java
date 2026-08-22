import java.util.* ;

public class mergeArray{
    public static void mergeArray(int[] a1,int[] a2 , int[] a3 , int n1,int n2){
        int i=0,k=0,j=0;
        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                a3[k++]=a1[i++];
            }
            else{
                a3[k++]=a2[j++];
            }
        }
        while(i<n1){
            a3[k++]=a1[i++];  
        }
        while(j<n2){
            a3[k++]=a2[j++];
        }
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] a1 = new int[100];
        int[] a2 = new int[100];
        int[] a3 = new int[100];

        System.out.println("Enter elements of Array 1:");
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.println("Enter elements of Array 2:");
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }

        mergeArray(a1, a2, a3, n1, n2);

        System.out.println("Array after merging:");
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(a3[i] + " ");
        }

        sc.close();
    }
}

//leetcode
//here we are merging without use of num3 hum num 1 main extra spaces rakh rhe usi me mun 2 ko add and start adding from last taki overwrite na ho
/* class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]<nums2[j]){
                nums1[k]=nums2[j];
                j--;
            }
            else{
                nums1[k]=nums1[i];
                i--;
            }
            k--;
        }        
        while(j>=0){
            nums1[k]=nums2[j];
            j--; k--;
        }        
    }
}


 */