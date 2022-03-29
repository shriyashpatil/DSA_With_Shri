
URL - https://leetcode.com/problems/merge-two-sorted-lists/submissions/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1!=null&&list2==null)
            return list1;
        
        if(list2!=null && list1==null)
            return list2;
        
        ListNode head=null,temp=null,prev=null;
        
        while(list1!=null && list2!=null){
            
            /// add list1 
            if(list1.val < list2.val){
                
                if(head==null){
                   head = new ListNode(list1.val,null); 
                   temp = head;
                   prev = temp;  
                }else{
                    
                    temp = new ListNode(list1.val,null);
                    prev.next = temp;
                }
                 prev = temp;  
                 list1 = list1.next;
                
            }else if(list1.val > list2.val){
                
                if(head==null){
                   head = new ListNode(list2.val,null); 
                   temp = head;
                  
                }else{
                    
                    temp = new ListNode(list2.val,null);
                    prev.next = temp;
                }
                prev = temp;  
                list2 = list2.next;
                
            }else{
                
                if(head==null){
                    
                    temp = new ListNode(list2.val,null);
                    head = new ListNode(list1.val,temp);
                    
                    
                    
                }else{
                    
                    temp = new ListNode(list2.val,null);
                    prev.next = new ListNode(list1.val,temp);
                    
                }
                
                prev = temp;
                list2 = list2.next;
                list1 = list1.next;
                
                
            }
            
            
        }
        
        
        while(list1!=null){
            
            temp = new ListNode(list1.val,null);
            prev.next = temp;
            prev = temp;
            
            list1 = list1.next;
            
        }
        
        while(list2!=null){
            
            temp = new ListNode(list2.val,null);
            prev.next = temp;
            prev = temp;
            
            list2 = list2.next;
            
        }
        
        return head;
        
    }
}