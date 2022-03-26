
URL - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    
    public int maxProfit(int[] prices) {
        
        int max = 0;
        
        int itr = prices.length - 2;
        int jtr = prices.length - 1;
        
        while(itr>=0){
            
            if(prices[itr]<prices[jtr]){
                
                int sub = prices[jtr]-prices[itr];
                
                if(sub>max){
                    
                    max = sub;
                
                }
                
                
            }else{
                    
                    jtr = itr;
            }
            
            itr--;
            
        }
        
        return max;
        
    }
}