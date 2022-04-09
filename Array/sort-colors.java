class Solution {
    public void sortColors(int[] nums) {
        
        int[] counts = new int[3];
        
        for(int itr=0 ; itr<nums.length ; itr++){
            
            counts[nums[itr]]++;
            
        }
        
        int itr = 0;
        int jtr = 0;    
            
        while(itr<counts.length){
            int count = counts[itr]; 
            while(count>0){
                nums[jtr] = itr;
                count--;
                jtr++;
            }
            
            itr++;
            
        }
        
    }
}