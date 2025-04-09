class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        /*int res=0;      -----> Not working for large inputs!
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                res=nums2[i];
                break;
            }
        }
    return res;*/

       int i=0;
       int j=0;
       while(i<nums1.length && j<nums2.length){
        if(nums1[i]==nums2[j]){
            return nums1[i];
        }else if(nums1[i]<nums2[j]){
            i++;
        }
        else{
            j++;
        }
       }
    return -1;
    }
}