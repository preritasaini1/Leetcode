class Solution {
    public int maximumWealth(int[][] arr) {
       int maxsum=0;
       for(int i=0;i<arr.length;i++) {
        int sum=0;
        for(int j=0;j<arr[i].length;j++) {
            sum=sum+arr[i][j];
			maxsum=Math.max(maxsum, sum);
		}
	} 
    return maxsum;
    }
}