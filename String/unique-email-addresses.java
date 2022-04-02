
URL - https://leetcode.com/problems/unique-email-addresses/

class Solution {
    
    public int numUniqueEmails(String[] emails) {
        
        HashSet<String> output = new HashSet<>();
        
        for(int itr = 0 ; itr<emails.length ; itr++){
            output.add(convert1(emails[itr]));
        }
        
        return output.size();
    }
    
    ///method 2
    String convert1(String s){
        
        String [] sec = s.split("@");
        String local = sec[0].split("\\+")[0].replace(".","");
        
        return local+"@"+sec[1];
        
    }
    
    
    /// method 1
    String convert(String s){
        
        int index1 = s.indexOf("+");
        int index2 = s.indexOf("@");
        String domain = s.substring(index2);
        
        String local="";
        int itr = 0;
        while(itr<s.length()){
            
            if(s.charAt(itr)=='+'||s.charAt(itr)=='@')
                break;
            else if(s.charAt(itr)!='.')
                local =local+s.charAt(itr);
            
            itr++;
        }
        
        return local+domain;
        
    }
    
}