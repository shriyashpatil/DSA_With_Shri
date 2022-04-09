
URL - https://leetcode.com/problems/unique-paths/


class Solution {
  
  public int uniquePaths(int m, int n) {
        
        long totalMoves = m+n-2;
        
        long totalRight = n-1;
        long totalDown = m-1;
        
        /// totalMoves C totalRight or totalMoves C totalDown
        
        double ans=1;
        
        long limit;
        
        if(totalDown<totalRight)
            limit = totalDown;
        else
            limit = totalRight;
        
       for(int itr = 1 ; itr<=limit ; itr++){
           
           ans = ans * (totalMoves-limit+itr)/itr;
          
        }
        
       
        
       return (int)ans; 
        
    }

    

}
