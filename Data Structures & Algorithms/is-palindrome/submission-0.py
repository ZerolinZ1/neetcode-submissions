class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleaned = s.replace(" ", "")
        lower_cleaned = cleaned.lower()
        clean_text = "".join(filter(str.isalnum, lower_cleaned))
        left = 0
        right = len(clean_text) - 1
        while (right > left) :
            if(clean_text[left] == clean_text[right]) :
                left += 1
                right -= 1
            else :
                return False
        return True

