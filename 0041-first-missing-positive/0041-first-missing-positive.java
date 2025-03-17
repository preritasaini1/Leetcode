class Solution {
    public int firstMissingPositive(int[] nums) {
        int res=nums.length+1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                res=i;
                break;
            }
        }
        return res;
    }
}