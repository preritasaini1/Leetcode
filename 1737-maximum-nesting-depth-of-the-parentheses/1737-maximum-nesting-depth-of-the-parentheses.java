class Solution {
    public int maxDepth(String s) {
          Stack<Character> stack=new Stack<>();
          int curr=0;
          int maxdepth=0;
          for(char ch:s.toCharArray()){
            if(ch=='('){
              stack.push(ch);
              curr+=1;
              maxdepth=Math.max(curr,maxdepth);
            }
            else if(ch==')'){
                stack.pop();
                curr-=1;
            }
          }
        return maxdepth;
    }
}