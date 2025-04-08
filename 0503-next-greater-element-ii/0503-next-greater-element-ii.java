class Solution {
    public int[] nextGreaterElements(int[] arr) {
    /*Stack<Integer> stack=new Stack<>();
    int res[]=new int[arr.length];
    Arrays.fill(res,-1);
    int idx=0;
    for(int i=0;i<2*arr.length;i++){
         idx=i%arr.length;
        while(! stack.isEmpty() && arr[idx]>arr[stack.peek()]){
                res[stack.pop()]=arr[idx];
        }
        stack.push(idx);
    }
    return res;*/

    Stack<Integer> st=new Stack<>();
	int res[]=new int[arr.length];
	for(int i=2*arr.length-1;i>=0;i--) {
		int pos=i%arr.length;
		while(!st.isEmpty() && arr[pos]>=st.peek()) {
			st.pop();
		}
		if(st.isEmpty()) {
			res[pos]=-1;
		}
		else {
			res[pos]=st.peek();
		}
		st.push(arr[pos]);      //not nu
	}
    return res;
    }
}