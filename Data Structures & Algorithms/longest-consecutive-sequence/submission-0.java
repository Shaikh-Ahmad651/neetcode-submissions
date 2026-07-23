class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> check = new HashSet<>();
        for(int x : nums)
        {
            check.add(x);
        }
        int count=0;
        int count2=0;
        for (int num : check)
        {
            if (!check.contains(num-1))
            {
                count2=1;
                while (check.contains(num+count2))
                {
                    count2++;
                }
            }
            count=Math.max(count,count2);
        }
        return count;
    }
}
