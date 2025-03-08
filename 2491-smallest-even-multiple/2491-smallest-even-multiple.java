class Solution {
    public int smallestEvenMultiple(int n) {
        int a =n;
        while(true){
            if(n%a==0 && n%2==0){
                return n;
            }
            else{
                n+=a;
            }
        }
    }
}