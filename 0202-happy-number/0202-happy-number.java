class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();  //use for breaking loop like 4 comes againg then again process and continues as it is unhappy number.
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            int sum=0;
            while(n!=0){
                int d=n%10;
                sum+=d*d;
                n=n/10;
            }
            n=sum;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}