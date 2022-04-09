
/// URL - https://leetcode.com/problems/non-decreasing-array/


class Solution {
    
    public boolean checkPossibility(int[] nums) {
        
       
        int change=0;
        
        for(int itr = 1 ; itr<nums.length ; itr++){
            
            if(nums[itr-1]>nums[itr]){
                
                if(change==1)
                    return false;
                
                change++;
                
                if(itr<2||nums[itr-2]<=nums[itr])
                    nums[itr-1] = nums[itr];
                else
                    nums[itr]=nums[itr-1];
                
            }
            
        }
        
        return true;
        
    }
}
