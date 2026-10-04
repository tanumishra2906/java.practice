//two pointer concept ref notes



import java.util.*;

public class moveZeroes {

    public static void moveZeroes(int[] nums) {

        int index = 0;

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Step 2: Fill the remaining positions with zeroes
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}

/* ### Move Zeroes – LeetCode 283

The goal is to move all zeroes to the end of the array while keeping the relative order of all non-zero elements unchanged.

We use a two-pointer approach:

* `i` scans the complete array.
* `index` keeps track of the position where the next non-zero element should be placed.
* In the first loop, zeroes are ignored and all non-zero elements are moved to the front.
* After all non-zero elements are placed, the remaining positions are filled with zeroes using a second loop.

For example:

`[0, 1, 0, 3, 12]` → `[1, 3, 12, 0, 0]`

Time Complexity: `O(n)`
Space Complexity: `O(1)`
 */