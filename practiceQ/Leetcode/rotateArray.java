import java.util.* ;
class rotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n; //Reduce k to avoid unnecessary rotations when k is greater than array length


        reverse(nums, 0, n - 1); //rev full array
        reverse(nums, 0, k - 1); //rev elements till k eg k=3 so firt 3 elem rev
        reverse(nums, k, n - 1); //roration of left elements eg k is start till last i.e n-1
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) { 
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotate(nums, k); //always print the array after calling using for loop

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}