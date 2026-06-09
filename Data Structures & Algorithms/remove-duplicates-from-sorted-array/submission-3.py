class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        L = 0 
        R = 0 

        if len(nums) == 1: 
            return 1

        while R < len(nums): 

            if nums[R - 1] != nums[R]:
                nums[L] = nums[R]
                L += 1
            
            R += 1
        
        return L