
URL - https://leetcode.com/problems/set-matrix-zeroes


class Solution {
    
    public void setZeroes(int[][] matrix) {
        
            int arr[][] = new int[1][2];
            int row = matrix.length;
            int col = matrix[0].length;
            List<int[]> value = new ArrayList<int[]>();
            
            for(int itr = 0 ;itr<matrix.length ; itr++){
            
                    for(int jtr = 0; jtr<matrix[itr].length ; jtr++){
                
                        if(matrix[itr][jtr]==0){
                                value.add(new int[]{itr,jtr});
                            }
                
                    }
            
            }
        
            for(int itr = 0 ; itr<value.size(); itr++){
            
                    /// column
                    for(int jtr = 0 ; jtr<col; jtr++){
                
                        matrix[value.get(itr)[0]][jtr] = 0;
                
                    }
            
                    /// row
                    for(int ktr = 0 ; ktr<row; ktr++){
                
                        matrix[ktr][value.get(itr)[1]] = 0;
                
                    }
            }
        
        
    }
} 
