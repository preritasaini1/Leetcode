class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int a=0;
        for(int ele: map.keySet()){
            if(map.get(ele)>1){
                res[a++]=ele;
            }
        }
        return res;
    }
}