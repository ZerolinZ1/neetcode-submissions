from operator import itemgetter
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        frequency = {}
        answer = []
        for i in range (len(nums)) :
            if(nums[i] not in frequency):
                frequency[nums[i]] = 1
            elif (nums[i] in frequency) :
                frequency[nums[i]] += 1

        sorted_dict = dict(sorted(frequency.items(), key=itemgetter(1), reverse = True))
        keys_list = list(sorted_dict.keys())
        for i in range (k) :
            answer.append(keys_list[i])
        return answer
            
        
            

