class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        res = self.top_down_dp(coins, amount, {})
        return -1 if res == float('inf') else res
    

    def top_down_dp(self, coins: List[int], amount: int, memo: Dict[int, int]) -> int:

        if amount == 0:
            return 0 
        
        if amount in memo: 
            return memo[amount]
        
        min_coins = float('inf')

        for coin in coins:
            if coin <= amount:
                min_coins = min(min_coins, 
                                1 + self.top_down_dp(coins, amount - coin, memo))
        memo[amount] = min_coins
        return memo[amount]

        