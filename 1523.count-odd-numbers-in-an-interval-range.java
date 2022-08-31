/*
 * @lc app=leetcode id=1523 lang=java
 *
 * [1523] Count Odd Numbers in an Interval Range
 *
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/description/
 *
 * algorithms
 * Easy (46.58%)
 * Likes:    982
 * Dislikes: 73
 * Total Accepted:    128.7K
 * Total Submissions: 276.4K
 * Testcase Example:  '3\n7'
 *
 * Given two non-negative integers low and high. Return the count of odd
 * numbers between low and high (inclusive).
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: low = 3, high = 7
 * Output: 3
 * Explanation: The odd numbers between 3 and 7 are [3,5,7].
 * 
 * Example 2:
 * 
 * 
 * Input: low = 8, high = 10
 * Output: 1
 * Explanation: The odd numbers between 8 and 10 are [9].
 * 
 * 
 * Constraints:
 * 
 * 
 * 0 <= low <= high <= 10^9
 * 
 */

// @lc code=start
class Solution {
    public int countOdds(int low, int high) {
        //Make both low and high as odd within range
        int nextOddLow = (low%2==0)?low+1:low;
        int prevOddHigh = (high%2==0)?high-1:high;

        //now return with adding 1 as diff only considers one end point.
        return 1 + (prevOddHigh-nextOddLow)/2;
    }
}
// @lc code=end

