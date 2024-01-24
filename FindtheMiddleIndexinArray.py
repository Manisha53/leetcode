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
#---------------same question -find-pivot-index-----------------------

""" Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index."""

class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        left=0
        right=sum(nums)

        for i in range(len(nums)):
            if left == right - nums[i]:
                return i
            left = left + nums[i]
            right = right - nums[i]
        return -1
        
