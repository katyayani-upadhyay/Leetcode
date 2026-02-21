class Solution {
    public boolean isPrime(int n){
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
        
    }
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        int bits=0;
        for(int i=left;i<=right;i++){
            bits=Integer.bitCount(i);
            if(isPrime(bits)){
                ans++;
            }

        }return ans;
        
    }
}