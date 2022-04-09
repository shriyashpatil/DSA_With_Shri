

URL - https://leetcode.com/problems/maximum-product-subarray/

///  solution for max product sub array


class Solution {
   
    public int maxProduct(int[] nums) {
        
        int ans = nums[0];
        int ma = nums[0];
        int mi = nums[0];
       
        
        for(int itr = 1 ; itr<nums.length ; itr++){
            
            /// negative condition
            if(nums[itr]<0){
                
                int temp = mi;
                mi = ma;
                ma = temp;
            }
            
            /// max value
            if(nums[itr]>(ma*nums[itr])){
                
                ma = nums[itr];
                
            }else{
                ma = ma*nums[itr];
            }
            
            
            ///min value
            if(nums[itr]<(mi*nums[itr])){
                
                mi = nums[itr];
            
            }else{
                
                mi = mi*nums[itr];
                
            }
            
            /// check max
            if(ans<ma){
                
                ans = ma;
                
            }
            
            
        }

        return ans;
        
    }
}
