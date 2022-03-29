
URL - https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

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
    public int getDecimalValue(ListNode head) {
        
        int length = 0;
        ListNode temp = head;
        while(temp!=null){
            
            length = length+1;
            
            temp = temp.next;
            
        }
        
        temp = head;
        int power = length-1;
        int ans = 0;
        while(temp!=null){
            
            if(temp.val==1){
                ans = ans + calculatePower(2,power);
            }
            power =  power - 1;
            
            temp = temp.next;
            
        }
        
        return ans;
        
        
    }
    
    static int calculatePower(int num, int power){
        int answer = 1;
        if(num > 0 && power==0){
            return answer;
        }
        else if(num == 0 && power>=1){
            return 0;
        }
        else{
            for(int i = 1; i<= power; i++){
                answer = answer*num;
            }
            return answer;
        }
    }
    
}