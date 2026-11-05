from collections import Counter

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if(len(s) != len(t)):
            return False;
        char_array_s = list(s)
        char_array_t = list(t)

        char_array_s.sort();
        char_array_t.sort();
        
        if(char_array_s == char_array_t) :
            return True;
        return False;
        