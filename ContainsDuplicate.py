    def containsDuplicate(self, nums: List[int]) -> bool:
        setOfNum = set((nums))
        if len(setOfNum) == len(nums):
            return False
        else:
            return True
