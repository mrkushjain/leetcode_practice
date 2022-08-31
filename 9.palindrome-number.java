/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        //negative num are not palindrome
        if(x<0 ||
            (x!=0 && x%10==0) //numbers ending with zero are not pallindrome except zero
        ){
            return false;
        }
        int halfRevx = 0, halfx = x;
        //Get half reverted number
        while(halfx>halfRevx){
            halfRevx = halfRevx*10 + halfx%10;
            halfx= halfx/10;
        }
        return halfx == halfRevx ||
               halfx == halfRevx/10; //for odd digit numbers we need to remove middle num

    }
}
// @lc code=end

