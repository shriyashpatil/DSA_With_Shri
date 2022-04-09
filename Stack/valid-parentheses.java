
/// Url - https://leetcode.com/problems/valid-parentheses/

class Solution {
    
    public boolean isValid(String s) {
        
        Mystack stack = new Mystack(s.length());
        
        int itr = 0;
        
        
        
        while(itr<s.length()){
            
            char ch = s.charAt(itr);
                
            if(ch=='('||ch=='{'||ch=='[')
                stack.push(ch);
            else if((ch==')'&&stack.peek()=='(')||(ch=='}'&&stack.peek()=='{')||(ch==']'&&stack.peek()=='[')){
                    
                    stack.pop();
                   
                }else{
                    stack.push(ch);
                }
            
            itr++;
        }
        
        return stack.isEmpty();
    }
}


class Mystack {
    
    char [] arr;
    int size;
    int top=-1;
    
    Mystack(int size){
        
        arr = new char[size];
    }

    boolean isEmpty(){
        
        if(top==-1){
            
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
    void push(char ch){
        
        
            top++;
            arr[top] = ch;
            
       
        
    }
    
    
    char pop(){
        int temp = top;
        top--;
        return arr[temp];
        
    }
    
    char peek(){
        if(top==-1)
            return '|';
        return arr[top];
    }
    
}

