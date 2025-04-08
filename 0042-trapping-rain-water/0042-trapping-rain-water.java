class Solution {
    public int trap(int[] arr) {
        /*int size=arr.length;
        int []arr2=new int[size];
        arr2[size-1]=arr[size-1];
        for(int i=size-2;i>=0;i--){
            if(arr2[i+1]>arr[i]){
                arr2[i]=arr2[i+1];
            }
            else{
                arr2[i]=arr[i];
            }
        }
        int []arr3=new int[size];
        arr3[0]=arr[0];
        for(int i=1;i<size;i++){
            if(arr3[i-1]>arr[i]){
                arr3[i]=arr3[i-1];
            }else{
                arr3[i]=arr[i];
            }
        }
        int sum=0;
        for(int i=0;i<size;i++){
            int min=Math.min(arr2[i],arr3[i]);
            sum=sum+(min-arr[i]);
        }
        return sum;*/

       //Optimized Appraoch-
        int lmax=0;
        int rmax=0;
        int total=0;
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]<arr[r]){
                if(lmax>arr[l]){
                    total+=lmax-arr[l];
                }
                else{
                    lmax=arr[l];
                }
             l=l+1;
            }
            else{
                if(rmax>arr[r]){
                    total+=rmax-arr[r];
                }
                else{
                    rmax=arr[r];
                }
                r=r-1;
            }
        }
    return total;
    }
}