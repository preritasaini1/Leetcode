class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    /*ArrayList<Integer> arr=new ArrayList<>();
	for(int i=0;i<n1.length;i++) {
		for(int j=0;j<n2.length;j++) {
			if(n1[i]==n2[j] && !arr.contains(n1[i])) {
				arr.add(n1[i]);
			}
		}
	}
	return arr.stream().mapToInt(Integer::intValue).toArray(); //for converting arraylist to array*/
    
    //Optimize approach-
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            if(set1.contains(num)){
                intersection.add(num);
            }
        }
        int[] result = new int[intersection.size()];
        int i = 0;
        for(int num : intersection){
            result[i++] =  num;
        }
        return result;
    }
}