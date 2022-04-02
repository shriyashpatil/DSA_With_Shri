
URL - https://leetcode.com/problems/reverse-only-letters/


class Solution {
   
    public String reverseOnlyLetters(String s) {
        
        int itr = 0;
        int jtr = s.length()-1;
        String output = "";
        
        while(itr < s.length()&&jtr>=0){
            
            if(Character.isLetter(s.charAt(itr)) && Character.isLetter(s.charAt(jtr))){
                
                output = output+s.charAt(jtr);
                itr++;
                jtr--;
              
            
            }else if(!Character.isLetter(s.charAt(itr))&& Character.isLetter(s.charAt(jtr))){
                
                output = output+s.charAt(itr);
                itr++;
               
           
            }else if(Character.isLetter(s.charAt(itr))&&!Character.isLetter(s.charAt(jtr))){
                
                jtr--;
                
                
            }else{
                
                output = output+s.charAt(itr);
                itr++;
                jtr--;
            }
            
        }
        
        while(itr<s.length()){
            
            output = output+s.charAt(itr);
            itr++;
        }
        
        return output;
    }
    
   
}
