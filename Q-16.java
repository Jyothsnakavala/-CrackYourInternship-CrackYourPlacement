class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();
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
            if(hm.get(i)==2){
                l.add(i);
            }
        }
        return l;
    }
}
