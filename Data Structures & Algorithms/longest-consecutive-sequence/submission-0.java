class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int curr_sequence = 1;
        int max_sequence = 0;
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] == nums[i] + 1) {
                curr_sequence++;
                if(max_sequence < curr_sequence) {
                    max_sequence = curr_sequence;
                }
            }
            else if(nums[i + 1] == nums[i]) {
                continue;
            }
            else {
                curr_sequence = 1;
            }
        }
        if(max_sequence < curr_sequence) {
                    max_sequence = curr_sequence;
                }
        return max_sequence;
    }
}
