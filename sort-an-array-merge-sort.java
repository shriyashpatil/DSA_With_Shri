
URL - https://leetcode.com/problems/sort-an-array/

class Solution {
    
    
    
    /// merge sort algo
    public int[] sortArray(int[] nums) {
        
        mergeSort(nums,0,nums.length-1);
        
        return nums;
    }
    
    
    public void mergeSort(int [] arr, int low , int high){
        
        if(low<high){
            
            int mid = (low+high)/2;
            
            mergeSort(arr,low,mid);
            
            mergeSort(arr,mid+1,high);
        
            merge(arr,low,mid,high);
        }
        
    }
    
    /// merge method
    public void merge(int[] arr,int low,int mid,int high){
        
        //length of two arrays
        int n1 = mid-low+1;
        int n2 = high-mid;
        
        /// take temp arrays
        int [] left = new int[n1];
        int [] right = new int[n2];
        
        /// fill the temp arrays with elements
        
        for(int itr=0 ; itr<n1;itr++){
            
            left[itr] = arr[low+itr];
        }
        
        for(int jtr=0;jtr<n2 ;jtr++){
            
            right[jtr] = arr[mid+1+jtr];
        }
        
        /// now merge the both array into another one
        int itr =0;
        int jtr = 0;
        int ktr = low;
        
        while(itr<n1&&jtr<n2){
            
            if(left[itr]<=right[jtr]){
                
                arr[ktr]=left[itr];
                itr++;
            }else{
                arr[ktr]=right[jtr];
                jtr++;
            }
            ktr++;
        }
        
        /// Add remaining one
        while(itr<n1){
            
            arr[ktr]=left[itr];
            itr++;
            ktr++;
            
        }
        
        while(jtr<n2){
            
            arr[ktr]=right[jtr];
            jtr++;
            ktr++;
        }
        
    }
    
    
    
}
