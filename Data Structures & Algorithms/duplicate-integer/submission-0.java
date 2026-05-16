class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> num = new HashSet<>();
        for (int i=0;i < nums.length;i++)
        {
            num.add(nums[i]);
        }
        int k=nums.length;
        int l=num.size();
        if (k==l)
        {
            return false;
        }
        return true;
        
    }
}