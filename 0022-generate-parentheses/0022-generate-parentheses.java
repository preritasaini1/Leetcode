class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        bactrack(result,"",0,0,n);
        return result;
    }
    public static void bactrack(List<String> result,String curr,int open,int close,int max){
        if(curr.length()== 2*max){
            result.add(curr);
            return;
        }
        if(open<max){
            bactrack(result,curr+"(",open+1,close,max);
        }
        if(close<open){
             bactrack(result,curr+")",open,close+1,max);
        }
    }
}