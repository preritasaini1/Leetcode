class Solution {
    public int[] nextGreaterElements(int[] arr) {
    Stack<Integer> stack=new Stack<>();
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
    return res;
    }
}