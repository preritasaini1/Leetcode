class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int sum=nums[l]+nums[r];
            if(sum==target){
                return new int[] {l + 1, r + 1};  //for reducing time limit exceeded we write like this... and l+1 , r+1 as in leetcode somtimes index start from 1!!
            }
            else if(sum>target){
                r--;
            }
            else{
                l++;
            }
        }
        return res;
    }
}