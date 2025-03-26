class Solution {
    public int[] replaceElements(int[] arr) {
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int l=i+1;
            int max=0;
            while(l<arr.length){
                if(arr[l]>max){
                    max=arr[l];
                }
                l++;
            }
            res[i]=max;
        }
        res[res.length-1]=-1;
        return res;
    }
}