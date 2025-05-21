class Solution {
    public String triangleType(int[] nums) {
           if(nums[0] + nums[1] <= nums[2] || nums[1] + nums[2] <= nums[0] || nums[0] + nums[2] <= nums[1]) return "none";  //A triangle is invalid if any two sides' sum is less than or equal to the third.
        if(nums[0] == nums[1] && nums[1] == nums[2]) return "equilateral";
        else if(nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) return "isosceles";
        else return "scalene";
    }
}