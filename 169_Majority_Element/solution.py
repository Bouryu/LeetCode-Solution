class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        el_dict = {}
        for c in nums:
            if c not in el_dict:
                el_dict[c] = 1
            else:
                el_dict[c] += 1
        return  max(el_dict, key= lambda x: el_dict[x])