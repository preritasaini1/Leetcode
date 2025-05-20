class Solution {
    public int arraySign(int[] nums) {
        int res=1;
        for(int i=0;i<nums.length;i++){    //don't need to multiply sirf number se matlab h so this way make it easier and good!!
            if(nums[i]<0) res*=-1;
            else if(nums[i]==0){
                res=0;
                break;
            }
            else{
                continue;
            }
        }
        return res;
    }
}