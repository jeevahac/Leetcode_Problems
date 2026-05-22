// Last updated: 5/22/2026, 7:24:27 PM
1class Solution {
2    public boolean isValid(String s) {
3        
4        Stack<Character> stack=new Stack<>();
5
6        for(char ch: s.toCharArray()){
7
8            if(ch=='{'||ch=='['||ch=='('){
9                stack.push(ch);
10            }
11            else if(ch=='}' && !stack.isEmpty() && stack.peek()=='{'){
12                stack.pop();
13            }
14            else if(ch==']' && !stack.isEmpty() && stack.peek()=='['){
15                stack.pop();
16            } 
17            else if(ch==')' && !stack.isEmpty() && stack.peek()=='('){
18                stack.pop();
19            } 
20            else{
21                return false;
22            }
23        }
24
25        return stack.isEmpty();
26    }
27}