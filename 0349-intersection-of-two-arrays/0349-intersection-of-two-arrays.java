class Solution {
    public int[] intersection(int[] n1, int[] n2) {
    ArrayList<Integer> arr=new ArrayList<>();
	for(int i=0;i<n1.length;i++) {
		for(int j=0;j<n2.length;j++) {
			if(n1[i]==n2[j] && !arr.contains(n1[i])) {
				arr.add(n1[i]);
			}
		}
	}
	return arr.stream().mapToInt(Integer::intValue).toArray(); //for converting arraylist to array
    }
}