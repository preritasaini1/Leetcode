class Solution {
    public int[] dailyTemperatures(int[] arr) {
    /*int res[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				res[i]=j-i;
				break;
			}
		}
	}
    return res;*/  //---TLE coming that's why use stack

    Stack<Integer> stack=new Stack<>();
    int res[]=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        while(! stack.isEmpty() && arr[i]>arr[stack.peek()]){
            int ind=stack.pop();
            res[ind]=i-ind;
        }
        stack.push(i);
    }
    return res;
    }
}