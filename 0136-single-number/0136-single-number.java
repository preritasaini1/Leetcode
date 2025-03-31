class Solution {
    public int singleNumber(int[] nums) {
        /*HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])<2){
                return nums[i];
            }
        }
        return -1;*/

        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[n-1];
    }
}