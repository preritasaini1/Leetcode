class Solution {
    public int countKeyChanges(String s) {
        /*int d=0;
        int count=0;
        for(int i=1;i<s.length();i++){
            char prev=s.charAt(i-1);
            char curr=s.charAt(i);
            if(Character.toLowerCase(prev)!= Character.toLowerCase(curr)|| 
            Character.toUpperCase(prev)!= Character.toUpperCase(curr)){
               count++;
            }
        }
        return count;*/

        s= s.toLowerCase();
        int cnt= 0;
        char temp=s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!= temp){
                cnt++;
                temp=s.charAt(i);
            }
        }

        return cnt;
    }
}