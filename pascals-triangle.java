
URL - https://leetcode.com/problems/pascals-triangle/

class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        
        
        
        for(int itr = 0 ; itr < numRows ; itr++ ){
            
            List<Integer> innerList = new ArrayList<Integer>();
            int innerLength = itr+1;
           
            innerList.add(1);
            
            if(innerLength>2){
                
                List<Integer> prevList = returnList.get(itr-1);
                int prevListLength = prevList.size();
                int prevItr = 0;
                int currentIndex = 1;
                while(currentIndex<innerLength-1){
                    
                    innerList.add(currentIndex,prevList.get(prevItr)+prevList.get(prevItr+1));
                    currentIndex++;
                    prevItr++;
                }
            }
            if(itr!=0)
                innerList.add(innerLength-1,1);
            returnList.add(innerList);
            
        }
        
        
        return returnList;
        
    }
}
