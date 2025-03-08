class Solution {
    public int alternateDigitSum(int n) {
        int sump=0;
        int sumn=0;
        String str=Integer.toString(n);
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                sumn+=str.charAt(i)-'0';
            }
            else{
                sump+=str.charAt(i)-'0';
            }
        }
        int res=sumn-sump;
        return res;
    }
}