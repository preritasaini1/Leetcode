class Solution {
    public boolean divisorGame(int n) {
    // logically humesha alice ko win karwana h toh it means n%2==0 always
    // like when n=2 then 1-alice then bob-0 same for n=4 alice-1,bob-1,alice-1 then bob-0
        if(n%2==0){
            return true;}
        return false;
    }
}