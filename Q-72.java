class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        int t=0;
        for(int i=0;i<=nums.length;i++){
            t+=i;
        }
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        return t-s;
    }
}
