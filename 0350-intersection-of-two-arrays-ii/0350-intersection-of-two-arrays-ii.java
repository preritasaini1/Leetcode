class Solution {
    public int[] intersect(int[] n1, int[] n2) {
    ArrayList<Integer> arr1=new ArrayList<>();
	ArrayList<Integer> arr2=new ArrayList<>();
	for(int n: n1) {
		arr1.add(n);
	}
	for(int n: n2) {
		if(arr1.contains(n)) {
			arr2.add(n);
            arr1.remove((Integer)n); //Remove element to prevent duplicates, Integer for removing correct value(not number on given index)
		}
	}
	int res[]=new int[arr2.size()];
	int i=0;
	for(int n: arr2) {
		res[i++]=n;
	}
	return res;
    }
}