import java.util.*;

class Solution {
    public int maxSubstrings(String word) {
         int n=word.length(),cnt=0;
        if(n<4) return 0;
        boolean[] seen=new boolean[26];
        for(int i=3;i<n;i++){
            seen[word.charAt(i-3)-'a']=true;
            if(seen[word.charAt(i)-'a']){
                cnt++;
                seen=new boolean[26];
                i+=3;
            }
        }
        return cnt;
    }
}
