class Solution {
    public int countHomogenous(String s) {
        long n= 1;
        long sum= 0;
        System.out.println(s.length());
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == s.charAt(i-1)) n++;
            else{
                sum += (n*(n+1))/2;
                n= 1;
            }
        }
        sum += (n*(n+1))/2;
        return (int)(sum % (Math.pow(10,9)+7));
        }
}