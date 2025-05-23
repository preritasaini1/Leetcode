class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int ele:arr) {
            set.add(ele);
        }
        /*for(int i=1;i<=arr[arr.length-1];i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }                                 Not Using this because if res size is less than k than IndexOutOfBound Error is generate!!
        //System.out.println(res);
        return res.get(k-1);*/

        int i=1;
        while(res.size()<k){     //This loop continues until exactly k missing numbers are collected, even if the k-th one is beyond the last number in the array.
            if(!set.contains(i)){
                res.add(i);
            }
            i++;
        }
        return res.get(k-1);   
    }
}