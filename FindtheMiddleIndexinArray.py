class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        leftSm=0
        rightSm=sum(nums)
        for i in range(len(nums)):
            if leftSm == rightSm - nums[i]:
                return i
            leftSm = leftSm + nums[i]
            rightSm = rightSm - nums[i]
        return -1
