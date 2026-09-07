import java.util.*;
public class consecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 ; //take 2 counters
        int max = 0 ;

        for(int i=0;i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0; //count goes back to 0
            }

            max=Math.max(max,count);  //max keeps on updating with count refer notes

        }
        return max;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n= sc.nextInt();
        System.out.println("enter elements of array");
        int nums[] = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result = findMaxConsecutiveOnes(nums);

        System.out.println("Maximum consecutive ones: " + result);

        sc.close();

        
        
    }
}
