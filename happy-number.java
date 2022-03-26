

URL - https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {
        
        int num =n ;
        
        if(num<0){
            return false;
        }
        
        while(true){
            
            int temp = num;
            int sum = 0 ;
            while(temp !=0){
                
                int rem = temp%10;
                
                sum =sum+rem*rem;
                
                temp = temp/10;
                
                
                
            }
            
            
            
            if(sum == 1){
                return true;
            }else if (sum==4){
                return false;
            }
            
            num =sum;
        }
        
    }
}