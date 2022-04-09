

URL - https://leetcode.com/problems/can-place-flowers/

class Solution {
    
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        List<Integer> possible  = new ArrayList<Integer>();
        int possibleCount = 0;
        for(int itr = 0 ; itr<flowerbed.length ; itr++){
            
            
                
                // at first position check forward
                if(itr==0){
                    if(flowerbed[itr]!=1){
                        try{
                            if(flowerbed[itr+1]==0){
                            
                                possible.add(itr);
                                possibleCount++;
                            }
                        }catch(Exception e){
                            possibleCount++;
                        }    
                            
                   }    
                 // at middle posistion check both side
                }else if(itr>0 && itr<flowerbed.length-1){                     
                     if(flowerbed[itr]!=1){
                         if(flowerbed[itr+1]==0 && flowerbed[itr-1]==0){
                             if(possible.isEmpty()){
                                 possible.add(itr);
                                 possibleCount++;
                             }else if(!possible.contains(itr+1) && !possible.contains(itr-1)){
                                 possible.add(itr);
                                 possibleCount++;
                             }
                         }
                             
                     }    
               // at last position check backward
                }else{
                   if(flowerbed[itr]!=1){
                       if(flowerbed[itr-1]==0)
                           if(!possible.contains(itr-1)){
                               possibleCount++;
                           }
                           
                   }    
                }
        }
        
        if(possibleCount>=n){
            
            return true;
        
        }else{
            
            return false;
        }
            
        
    }

}
