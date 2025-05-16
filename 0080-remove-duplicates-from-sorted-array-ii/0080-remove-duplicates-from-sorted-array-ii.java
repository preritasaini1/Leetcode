class Solution {
    public int removeDuplicates(int[] nums) {
        int i=2;
        for(int j=2;j<nums.length;j++){
            if(nums[j]!=nums[i-2]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        return i;
    }
}