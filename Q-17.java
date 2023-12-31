class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
          int he=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int currwater=he*width;
            maxwater=Math.max(currwater,maxwater);
            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
            
        }
        return maxwater;
    }
}

