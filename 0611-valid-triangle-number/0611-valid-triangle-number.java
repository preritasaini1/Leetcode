class Solution {
    public int triangleNumber(int[] nums) {
        /* A triangle is valid if the sum of any two sides is greater than the third side.
        When the array is sorted, we only need to check: a+b>c */
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += j - i;   //This avoids checking each pair individually and speeds things up — this is two-pointer optimization.
                    j--;
                } 
                else {
                    i++;
                }
            }
        }
        return count;
    }
}