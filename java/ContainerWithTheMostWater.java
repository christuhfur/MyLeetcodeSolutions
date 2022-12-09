class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length-1;

        int result  = 0;

        while (left < right) {

            int area = (right - left) * Math.min(height[right], height[left]);
            result = Math.max(area, result);

            if (height[left] < height[right]) {
                left++;
            }else {right--;}
        }

        return result;

        //linear time solution O(n)

        
    }
}
