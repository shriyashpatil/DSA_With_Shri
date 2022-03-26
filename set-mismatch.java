
URL - https://leetcode.com/problems/set-mismatch/


class Solution {
    
    public int[] findErrorNums(int[] nums) {
        
        int [] hash = new int[nums.length];
        int duplicate = 0;
        for(int itr = 0 ; itr<nums.length ; itr++){
            
            /// hash function
            int ans = nums[itr]-1;
            if(hash[ans]==nums[itr]){
                duplicate = nums[itr];
            }
            hash[ans]=nums[itr];
            
                
            
        }
        
        for(int itr = 0;itr<hash.length;itr++){
            
            if(hash[itr]==0){
                
                return new int[]{duplicate,itr+1};
                
            }
            
        }
        
        return new int[0];
    }
}
