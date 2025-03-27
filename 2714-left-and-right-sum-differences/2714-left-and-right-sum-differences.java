class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans= new int[nums.length];
        int left=0,right=Arrays.stream(nums).sum();
        for (int i=0;i<nums.length;i++){
           right-=nums[i];
           ans[i]=Math.abs(left-right);
           left+=nums[i];
        }
        return ans;
    }
}