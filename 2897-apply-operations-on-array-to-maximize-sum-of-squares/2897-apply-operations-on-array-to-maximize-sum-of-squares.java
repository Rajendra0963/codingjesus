class Solution {
    public int maxSum(List<Integer> nums, int k) {
          int mod = 1_000_000_007;
        int bits[] = new int[32];
  
        for(int i = 0;i<nums.size();i++){
            for(int b= 0 ;b<32;b++){
              if ((nums.get(i) & (1L << b)) != 0) {
                    bits[b]++;
                }
            }
        }

        long ans = 0 ;

        for(int i = 0 ;i<k;i++){
            long x = 0;

            for(int b = 31 ; b >=0; b--){
                if(bits[b]> 0 ){
                    x |= (1L<<b);
                    bits[b]--;
                }
            }

          ans = (ans + x * x) % mod; 
        }
       return (int) ans;
    }
}