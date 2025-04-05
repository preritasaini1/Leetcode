class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(digits);
        int new1 = digits[0] * 10 + digits[2];  
        int new2 = digits[1] * 10 + digits[3];  //as after sorting array we get smallest no. in 0th and 1st position and from that one we get minimum sum - 23+29=52;
        return new1 + new2;
    }
}