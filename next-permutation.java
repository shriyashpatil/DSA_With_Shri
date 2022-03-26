
URL - https://leetcode.com/problems/next-permutation/


class Solution {

    public void nextPermutation(int[] nums) {
        
        if(nums.length>0){
            
            int itr = nums.length-2;
            
            while(itr>=0){
                
                if(nums[itr]<nums[itr+1]){
                    
                        break;
                }else{
                        itr--;
                }
                    
                
            }

            if(itr>=0){
                   int jtr = nums.length-1;
               
                    while(jtr>0){
                    
                            if(nums[itr]<nums[jtr]){
                        
                                    //swap
                        
                                    int temp = nums[itr];
                                    nums[itr] = nums[jtr];
                                    nums[jtr] = temp;
                        
                                    break;
                        
                            }else{
                                    jtr--;
                            }
                    
                    }
                
            }
            /// reverse from itr+1 till length-1
            reverse(nums,itr+1,nums.length-1);
            
            
            
        }      
        
    }
    
    //// reverse function
    public void reverse(int arr[],int itr,int jtr){
        
            while(itr<jtr){
            
                    int temp = arr[itr];
                    arr[itr] = arr[jtr];
                    arr[jtr] = temp;
                    itr++;
                    jtr--;
            
            }
        
    }
    
    
    
    
}
