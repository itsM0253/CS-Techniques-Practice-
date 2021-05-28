
public class SlidingWindow2 {



	public static void main(String[] args) {
		int[] arr = {4,2,1,7,8,1,2,8,10};
		int target = 8;
		int result = findSamllestSubArray(arr,target);
		System.out.println(result);

	}
	
	public static int findSamllestSubArray(int[] arr, int targetSum) {
		int minWindowSize = 0; 
		int currentWindowSum = 0;
		int windowStart = 0;
		
		
		for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
			currentWindowSum += arr[windowEnd];
			
			while(currentWindowSum >= targetSum) {
//				System.out.println(i);
				minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
//				System.out.println(windowStart + 1);
//				System.out.println(minWindowSize);
				currentWindowSum -= arr[windowStart]; // removes that value all the way in the left
				windowStart++;
			}
		}
		return minWindowSize;
		
	}
	

}
