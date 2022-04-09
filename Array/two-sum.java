
URL - https://leetcode.com/problems/two-sum/

class Solution {
    
    public int[] twoSum(int[] nums, int target) {
            
            for(int itr =0 ;itr<nums.length;itr++){
                
                for(int jtr = itr+1 ; jtr<nums.length;jtr++){
                    
                    if(nums[itr]+nums[jtr]==target){
                        
                        int [] arr={itr,jtr}; 
                        return arr;
                    }
                    
                }
                
            }
            int arr [] ={};
            return arr;
    }
}