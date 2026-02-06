class Solution {
    public void moveZeroes(int[] nums) {

        int index = 0;

        // Step 1: shift non-zero forward
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Step 2: remaining positions fill with 0
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
