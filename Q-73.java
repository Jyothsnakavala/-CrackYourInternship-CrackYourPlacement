class Solution {
    public int reverse(int x) {
        long rev=0;
        boolean isneg=false;
        if(x<0){
            isneg=true;
            x=x*-1;
        }
        while(x>0){
            int ld=x%10;
            rev=rev*10+ld;
            x=x/10;
        }
        if (rev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isneg ? -rev : rev);

        
    }
}
