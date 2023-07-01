class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }else{
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        Set<Integer> keySet=hm.keySet();
        for(int i:keySet){
            if(hm.get(i)>1){
                return i;
            }
        }
        return -1;
    }
}
