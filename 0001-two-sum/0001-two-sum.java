class Solution {
   public int[] twoSum(int[] nums, int target) {
		/*int sum = 0;
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr; 
                }
            }
        }
        return new int[0]; */
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        
        return new int[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}