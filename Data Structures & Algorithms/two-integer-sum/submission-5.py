class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        my_map = {value: index for index, value in enumerate(nums)}
        for i in range (len(nums)) :
            diff = target - nums[i]
            if(diff in my_map and my_map.get(diff) != i) :
                other_index = my_map.get(diff)
                answer = [other_index, i]
                answer.sort()
                return answer
        return []