class Solution:
def rob(self, nums: List[int]) -> int:

    rob_potential = nums.copy()
    rob_potential.extend([0,0,0])
    
    #using memoization
    #rob_potential calculates the money from current house and houses after that
    for i in range(len(nums)-1,-1,-1):
        rob_potential[i] += max(rob_potential[i+3],rob_potential[i+2])
        
    return max(rob_potential[0],rob_potential[1])
