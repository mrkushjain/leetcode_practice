/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 *
 * https://leetcode.com/problems/generate-parentheses/description/
 *
 * algorithms
 * Medium (72.24%)
 * Likes:    16699
 * Dislikes: 655
 * Total Accepted:    1.3M
 * Total Submissions: 1.8M
 * Testcase Example:  '3'
 *
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * 
 * Example 1:
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * Example 2:
 * Input: n = 1
 * Output: ["()"]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= n <= 8
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> parentheses = new ArrayList<String>();
        generateParenthesis(parentheses, n, n , "");
        return parentheses;
    }

    void generateParenthesis(ArrayList<String> parentheses,  int leftRem, int rightRem, String current) {
        if(rightRem == 0 && leftRem == 0){
            parentheses.add(current);
        }

        if(rightRem < leftRem ) {
            return;
        }

        if(leftRem > 0) {
            generateParenthesis(parentheses, leftRem-1, rightRem, current + "(");
        }
        if(rightRem > leftRem) {
            generateParenthesis (parentheses, leftRem, rightRem-1, current + ")");
        }
    }
}
// @lc code=end

