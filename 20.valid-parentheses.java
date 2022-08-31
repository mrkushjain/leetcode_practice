import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

class Solution {

    boolean isOpeningBrace(char c){
        return c=='('||c=='{'||c=='[';
    }

    boolean isMatching(char opening, char closing){
        switch(opening){
            case '(':
                return closing == ')';
            case '{':
                return closing == '}';
            case '[':
                return closing == ']';
        }
        return false;
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(char c: s.toCharArray()){
            if(isOpeningBrace(c)) {
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                if (!isMatching(stack.peek(), c)){
                    return false;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
// @lc code=end

