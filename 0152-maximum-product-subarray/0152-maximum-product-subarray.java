class Solution {
    public int maxProduct(int[] nums) {
        int max_product=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
             int product=1;
            for (int j=i;j<nums.length;j++){
                product*=nums[j];
                max_product=Math.max(max_product,product);
            }
        }
        return max_product;
    }
}