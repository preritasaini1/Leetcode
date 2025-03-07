class Solution {
    public int differenceOfSum(int[] nums) {
        int elesum=0;
        int dsum=0;
        for(int i=0;i<nums.length;i++){
            elesum+=nums[i];
            int n=nums[i];
            while(n!=0){
                int d=n%10;
                dsum+=d;
                n=n/10;
            }
        }
        int res=elesum-dsum;
        return res;
    }
}