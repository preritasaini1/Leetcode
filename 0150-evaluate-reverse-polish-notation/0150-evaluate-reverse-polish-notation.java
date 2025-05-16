class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") && !st.isEmpty()){
                st.push(st.pop()+st.pop());
            }
            else if(tokens[i].equals("-") && !st.isEmpty()){
                int a=st.pop();
                st.push(st.pop()-a);
            }
            else if(tokens[i].equals("/") && !st.isEmpty()){
                int a=st.pop();
                st.push(st.pop()/a);
            }
            else if(tokens[i].equals("*") && !st.isEmpty()){
                st.push(st.pop()*st.pop());
            }
            else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}