class Solution {
    public int[] plusOne(int[] digits) {
       /*int l=digits.length-1;
       int a[]=new int[2];
       if(digits[l]==9){
        if(digits.length==1){
            a[0]=1;
            a[1]=0;
        }else{
            digits[l]=0;
            digits[l-1]+=1;
        }
       }else{
        digits[l]+=1;
       }
       if(digits[l]==9){
        return a;
       }else{
        return digits;
       }*/

       int n = digits.length;
       for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; 
                return digits;
            }
            digits[i] = 0; 
        }
        int[] new1 = new int[n+1];
        new1[0] = 1;
    return new1;
    }
}