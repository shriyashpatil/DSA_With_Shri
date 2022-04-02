
URL - https://leetcode.com/problems/longest-common-prefix/


class Solution {
    public String longestCommonPrefix(String[] strs) {
     
            String output = "";
            int jtr = 0;
            
            while(jtr<strs[0].length()){
                
                int flag = 0;
                
                for(int itr = 1 ; itr<strs.length ; itr++){
                    
                    if(strs[itr].length()==jtr){
                        flag = 1;
                         break; 
                    }
                          
                    if(strs[0].charAt(jtr)!=strs[itr].charAt(jtr)){
                        
                        flag = 1;
                        break;
                    }    
                
                }
                
                if(flag==0)
                    output = output + strs[0].charAt(jtr);
                else 
                    break;
                
                jtr++;
            }
            
            return output;
    }
}