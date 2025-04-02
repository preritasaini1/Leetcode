class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        int count=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                stack.push(count);
                count=0;
            }
            else{
                count=stack.pop()+Math.max(2*count,1);
            }
        }
        return count;
    }
}