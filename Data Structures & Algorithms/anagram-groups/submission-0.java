class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>(); 
        HashMap<String, List<String>> words = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] ordered_letters = strs[i].toCharArray();
            Arrays.sort(ordered_letters);
            String order = new String(ordered_letters);
            if(!words.containsKey(order)) {
                words.put(order, new ArrayList<>());
            }
            if(words.containsKey(order)) {
                words.get(order).add(strs[i]);
            }
            
        }
        for(List<String> anagrams : words.values()) {
            output.add(anagrams);
        }
        return output;
    }
}
