class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int t=x;
        int sum=0;
        while(x!=0){
            int d=x%10;
            sum+=d;
            x=x/10;
        }
        if(t%sum==0){
            return sum;
        }
        return-1;
    }
}