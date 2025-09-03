class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        ArrayList<Integer> l= new ArrayList<Integer>();
        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
            else hm.put(nums[i],1);
        }

        for(int i=0;i<n;i++){
            if(hm.get(nums[i])>n/3  && !l.contains(nums[i])) l.add(nums[i]);
        }

        
        return l;
    }
}