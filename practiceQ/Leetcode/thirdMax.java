//print third max but if not found print largest
//take 3 var and keep comparing it with elements of array in 3 diff cases

import java.util.Scanner;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {

        //comparision wale questions main assign long.min_value (max find krna ho then this is very small initial value else for min use long.max_value)
        long v1 = Long.MIN_VALUE;  //Abhi tak mujhe koi number nahi mila, isliye main ek aisa number rakh deti hoon jo kisi bhi valid int se chhota hai
        long v2 = Long.MIN_VALUE;  //indicates req number hasn't been found yet
        long v3 = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == v1 || nums[i] == v2 || nums[i] == v3) {
                continue;  //i.e skip comparision part if num is already there
            }

            if (nums[i] > v1) { //update max
                v3 = v2;
                v2 = v1;
                v1 = nums[i];
            } else if (nums[i] > v2) { //update second max
                v3 = v2;
                v2 = nums[i];
            } else if (nums[i] > v3) { //update third max
                v3 = nums[i];
            }
        }

        if (v3 == Long.MIN_VALUE) //i.e third max mila hi nhi cuz long mn update hi nhi hua
            return (int)v1; //return max

        return (int)v3; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n]; //declare array nums

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = thirdMax(nums);

        System.out.println("Third maximum number: " + result);

        sc.close();
    }
}