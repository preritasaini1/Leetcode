class Solution {
    public int[] leftRightDifference(int[] nums) {
        for(int i=1;i<=nums.length-1;i++) {
				nums[i]=nums[i-1]+nums[i];
		}
     int n=nums.length-1;
     int[] arr=new int[nums.length];
     int left=0;
     for(int i=0;i<=n;i++) {
        	 arr[i]=Math.abs(left-(nums[n]-nums[i]));
             left=nums[i];
     }
     return arr;
    }
}