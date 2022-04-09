
URL -  https://leetcode.com/problems/build-array-from-permutation/

class Solution {
    public int[] buildArray(int[] nums) {
        
        int[] array = new int[nums.length];
        
        for(int itr=0;itr<nums.length;itr++){
            
            array[itr]=nums[nums[itr]];
        }
        
        return array;
    }
}
