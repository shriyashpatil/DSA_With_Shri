
URL - https://leetcode.com/problems/maximum-subarray/

class Solution {
    
    public int maxSubArray(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int itr=0;itr<nums.length;itr++){
            
            sum = sum + nums[itr];
            
            if(sum>max){
                
                max = sum;
            }
            
            if(sum<0){
                
                sum = 0;
            }
            
        }
        
        return max;
    }
}
