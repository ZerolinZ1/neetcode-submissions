class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 2) {
                if(nums[0] == nums[1]) {
                    return true;
                }
                else {
                    return false;
                }
            }
        if(nums.length == 1 || nums.length == 0) {
            return false;
        }
        for(int i = 0; i < nums.length; i++) {
            if(i + 1 == nums.length) {
                continue;
            }
            if(i == 0) {
                continue;
            }
            if(nums[i] == nums[i -1] || nums[i] == nums[i + 1]) {
                return true;
            }
            else {
                continue;
            }
        }
        return false;
    }
}