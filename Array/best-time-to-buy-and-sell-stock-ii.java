class Solution {
    
    public int maxProfit(int[] prices) {
        
        int itr = 0; 
        int jtr = itr+1;
        int sum = 0;
        
        /// if single element then buy sell operations doesnt happen then profit is zero na
        if(prices.length<=1){
            return sum;
        }
        
        while(jtr<prices.length){
            
            if(prices[jtr]>prices[itr]){
                if(jtr+1==prices.length||prices[jtr]>prices[jtr+1]){
                    sum = sum + (prices[jtr]-prices[itr]);
                    itr = jtr+1;
                    jtr = itr+1;
                }else{
                    jtr++;
                }
            }else{
                itr++;
                jtr++;
            }
            
        }
        
        return sum;
    }
}