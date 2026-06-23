class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l, r = 0, 1   # l is buy, r is sell
        maxP = 0   # max profit

        while r < len(prices):
            # is profitable?
            if prices[l] < prices[r]:
                profit = prices[r]-prices[l]
                maxP = max(maxP, profit)
            else:
                l = r # if prices[r]<prices[l]then update l to r, since we want to buy at lowest price.--> heart of the problem
            r += 1
        return(maxP)        
