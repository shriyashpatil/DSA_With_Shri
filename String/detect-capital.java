
URL - https://leetcode.com/problems/detect-capital/


class Solution {
   
    public boolean detectCapitalUse(String word) {
        
        int itr = 0;
        int flag = 0;
        int lowerLength = 0;
        int upperLength = 0;
        
        while(itr<word.length()){
            
            if(Character.isLowerCase(word.charAt(itr)))
                lowerLength++;
            else if(itr==0){
                flag = 1;
                upperLength++;
            }else{
                flag = 0;
                upperLength++;
            }
                
            itr++;
        }
        
        if(lowerLength==itr){
            return true;
            
        }else if(upperLength==itr){
            
            return true;
        
        }else if(flag==1){
            
            return true;
        
        }else{
          
            return false;
        }
        
        
    }
}