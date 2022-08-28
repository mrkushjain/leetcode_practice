/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int num = x;
        int revx = 0;
        while(num!=0){
            revx=revx*10 + num%10;
            num = num/10;
        }
        num =x;
        while(num!=0 && revx!=0){
            if(num%10 != revx%10){
                return false;
            }
            num = num /10;
            revx = revx/10;
        }
        return true;

    }
}
// @lc code=end

