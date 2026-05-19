class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequent = new HashMap<>();
        for (int i=0 ; i<nums.length ; i++)
        {
            if(frequent.containsKey(nums[i]))
            {
                frequent.put(nums[i],frequent.get(nums[i])+1);
            }
            else
                frequent.put(nums[i], 1);
        }
        int arr[]=new int[k];
        for (int i=0;i<k;i++)
        {
            int maxfreq = 0;
            int max= 0;
            for(Map.Entry<Integer,Integer> val : frequent.entrySet())
            {
                if(val.getValue()>maxfreq)
                { 
                    maxfreq = val.getValue();
                    max = val.getKey();
                }
            }
            arr[i]=max;
            frequent.remove(max);
        }
        return arr;

    }
}
