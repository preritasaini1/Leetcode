class Solution {
    public int averageValue(int[] nums) {
        int res=0;
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                sum=sum+nums[i];
                count++;
            }
        }
        if(count!=0) res=sum/count;
        return res;
    }
}