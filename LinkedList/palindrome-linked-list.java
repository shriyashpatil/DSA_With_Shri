
URL - https://leetcode.com/problems/palindrome-linked-list/

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
    public boolean isPalindrome(ListNode head) {
        
        
        
        ListNode temp = head;
        ListNode last = null;
        int length = 0; 
        
       while(temp!=null){
           length = length + 1;
           temp = temp.next;
       }     
        
       int [] arr = new int[length];
       int itr = 0 ;
       temp =head;
       while(temp!=null){
           
           arr[itr] = temp.val;
           itr++;
           temp = temp.next;
           
       } 
       
        
        temp = head;
        itr = arr.length-1;
        while(itr>=0){
            
            if(arr[itr]!=temp.val){
                return false;
            }
            
            itr = itr -1;
            temp = temp.next;
            
        }
        
        return true;
        
    }
}