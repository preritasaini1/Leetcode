class Solution {
    public int findClosest(int x, int y, int z) {
        int p1=Math.abs(x-z); //abs- for non negative distance as hume sirf distance se matlab h!
        int p2=Math.abs(y-z);
        if(p1<p2) return 1;
        else if(p1>p2) return 2;
        else return 0;
    }
}