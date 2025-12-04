package oops;

public class MaxUnitWater {
	public static void main(String[] args) {
		int[] heights = {1,8,6,2,5,4,8,3,6};
		
		int ans = maxArea(heights);
		System.out.println( ans);
	}

	private static int maxArea(int[] heights) {
		
		int left=0;
		int right=heights.length-1;
		int maxArea=0;
		
		while(left <= right) {
			
			int height = Math.min(heights[left], heights[right]);
			int width = right-left;
			
			int area = width*height;
			
			maxArea = Math.max(maxArea, area);
			
			if(heights[left]<heights[right])
				left++;
			else
				right--;
			
		}
		
		return maxArea;
		
	}

}
