class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        Arrays.sort(s_array);
        Arrays.sort(t_array);
        String new_s = new String(s_array);
        String new_t = new String(t_array);
        if(new_s.equals(new_t)) {
            return true;
        }
        else {
            return false;
        }
    }
}
