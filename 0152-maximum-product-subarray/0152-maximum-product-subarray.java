class Solution {
    public int maxProduct(int[] nums) {
       /* int max_product=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
             int product=1;
            for (int j=i;j<nums.length;j++){
                product*=nums[j];
                max_product=Math.max(max_product,product);
            }
        }
        return max_product;*/

        //Optimmal Approach- Kadane's Algorithm
        int max_product = nums[0];
    int min_product = nums[0]; // Track min in case of negatives
    int result = nums[0];

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < 0) {
            // Swap max and min when encountering a negative number
            int temp = max_product;
            max_product = min_product;
            min_product = temp;
        }

        max_product = Math.max(nums[i], max_product * nums[i]);
        min_product = Math.min(nums[i], min_product * nums[i]);

        result = Math.max(result, max_product);
    }

    return result;
    }
}