class Solution {
    public int countPrimes(int n) {  //Using Sieve of Eratosthenes optimize method!
        if(n<=2) return 0;
        boolean isPrime[]=new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){    //Only go up to √n (efficient!)
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime[i])count++;
        }
        return count;
    }
}