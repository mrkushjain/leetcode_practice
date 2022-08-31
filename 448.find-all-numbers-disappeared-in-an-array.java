/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //Make elements at given indices as negative
        for(int i =0; i<nums.length;i++){
            int posVal = Math.abs(nums[i]);
            nums[posVal-1] = -Math.abs(nums[posVal-1]);
        }
        //Return list of positive indices
        List<Integer> result = new ArrayList();
        for(int i =0;i<nums.length;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }
}
// @lc code=end

