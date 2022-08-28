/*
 * @lc app=leetcode id=836 lang=java
 *
 * [836] Rectangle Overlap
 */

// @lc code=start
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(
            rec1[0] == rec1[2] ||
            rec1[1] == rec1[3] ||
            rec2[0] == rec2[2] ||
            rec2[1] == rec2[3]
        ) { // is a line
            return false;
        }

        if(
            rec1[2] <= rec2[0] || // left or just touch
            rec1[1] >= rec2[3] || // up or just touch
            rec2[2] <= rec1[0] || // right or just touch
            rec2[1] >= rec1[3]  // down or just touch
        ) {
            return false;
        }
        return true;
    }
}
// @lc code=end

