class Solution {
    public int getSum(int a, int b) {
         while (b != 0) {
            int carry = (a & b) << 1;  // Calculate carry, And+shift left
            a = a ^ b;                 // Sum without carry, XOR
            b = carry;                 // Update b to carry
        }
        return a;
    }
}