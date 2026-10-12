class Solution {
    public int mySqrt(int x) {
        int i = 1 , j = x;

        while(i<=j){
            int mid = i + ( j - i ) / 2 ;

            long square = (long) mid*mid;


            if(square == x) return mid;
            else if(square < x) i = mid + 1;
            else j = mid -1 ;
        }
        return j;
    }
}