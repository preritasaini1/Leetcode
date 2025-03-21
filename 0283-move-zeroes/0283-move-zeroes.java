class Solution {
    public void moveZeroes(int[] nums) {
		/*for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==0) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/

        /*int j=0;
        int g=0;
        while(g<nums.length){
            if((nums[j]==0 && nums[g]==0) || (nums[j]!=0 && nums[g]==0)) g++;
            else if(nums[j]!=0 && nums[g]!=0){
                nums[j]=nums[g];
                j++;
                g++;
            }
        while(j<nums.length){
            nums[j++]=0;
        }
        }*/

        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){   //Partition template (focus on left side , left kya lana h!)
                int t=nums[l];
                nums[l]=nums[i];
                nums[i]=t;
                l++;
            }
        }
    }
}