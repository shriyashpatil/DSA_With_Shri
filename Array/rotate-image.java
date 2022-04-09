
URL - https://leetcode.com/problems/rotate-image/

class Solution {
   
    public void rotate(int[][] matrix) {
        
        int [][] output = new int[matrix.length][matrix.length];
        int length = matrix.length-1;
        for(int itr = 0 ; itr<matrix.length;itr++){
            
            for(int jtr = 0 ; jtr<matrix[itr].length ; jtr++){
                
                output[jtr][length-itr] = matrix[itr][jtr];
                
            }
        }
        
        for(int itr = 0 ; itr<matrix.length;itr++){
            
            for(int jtr = 0 ; jtr<matrix[itr].length ; jtr++){
                
                matrix[itr][jtr] = output[itr][jtr];
                
            }
        }
    }
}