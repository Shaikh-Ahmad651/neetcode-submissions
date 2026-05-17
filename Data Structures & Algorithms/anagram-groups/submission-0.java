class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> mapped = new HashMap<>();
        for ( String words : strs)
        {
            char[] arr= words.toCharArray();
            Arrays.sort(arr);
            String sortedwords= new String(arr);

            if (!mapped.containsKey(sortedwords))
            {
                mapped.put(sortedwords ,new ArrayList<>());
            }
            mapped.get(sortedwords).add(words);
        }
        return new ArrayList<>(mapped.values());
    }
}
