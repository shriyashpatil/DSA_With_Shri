
URL - https://leetcode.com/problems/merge-intervals/


class Solution {
    
    public int[][] merge(int[][] intervals) {
        
        
        if(intervals.length<=1)
            return intervals;
        
        List<int[]> temp = new ArrayList<int[]>();
        
        
        int itr = 0;
        
        int ktr = 0;
        
        /// sort 2-d array
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        
        /// till the end of array
        while(itr<intervals.length){
            
            ///check the temp list is empty
            if(temp.isEmpty()){
                
                int [] arr = new int[2];
                
                if(intervals[itr][1]>=intervals[itr+1][0]){
                
                    arr[0] = intervals[itr][0];
                
                    if(intervals[itr][1]>=intervals[itr+1][1])
                        arr[1] = intervals[itr][1];
                    else
                        arr[1] = intervals[itr+1][1];
                
                    itr = itr+2;
                    
                
                }else{
                
                
                    arr[0] = intervals[itr][0];
                    arr[1] = intervals[itr][1];
                
                    itr++;
                   
                
                }
            
                temp.add(arr);
                
            }
            /// if not empty then compare with the list latest element
            else{
                
                int [] tempArr = temp.get(ktr);
                int arr[] = new int[2];
                
                ///check wheter overlap
                if(tempArr[1]>=intervals[itr][0]){
                
                    arr[0] = tempArr[0]<intervals[itr][0]?tempArr[0]:intervals[itr][0];
                
                    if(tempArr[1]>=intervals[itr][1])
                        arr[1] = tempArr[1];
                    else
                        arr[1] = intervals[itr][1];
                
                    itr = itr+1;
                    
                     
                    /// add to the current position
                    temp.set(ktr,arr);
                    
                
                }
                /// not overlap
                else{
                
                
                    arr[0] = intervals[itr][0];
                    arr[1] = intervals[itr][1];
                
                    itr++;
                    
                    /// add to next index
                    temp.add(arr);
                    ktr++;
                
                }
                
                
            }     
            
            
        }
        
        return temp.toArray(new int[temp.size()][]);
        
    }
    
}
