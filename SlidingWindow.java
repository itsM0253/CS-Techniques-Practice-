
/**
 * 
 * @author mohamud
 * Find the max sum of subarray of fixed size k
 * 
 * Example input:
 * [4,2,1,7,8,1,2,8,1,0]
 */
public class SlidingWindow {

	public static void main(String[] args) {
		int[] arr = {4,2,1,7,8,1,2,8,1,0};
		int result = findMaxSum(arr,3);
		System.out.println(result);

	}
	
	public static int findMaxSum(int[] arr, int k) {
		int maxValue = 0;
		int currentRunningSum = 0;
		
		// I need to traverse through the elements in the array
		for(int i = 0; i < arr.length; i++) {
			currentRunningSum += arr[i]; // 
			if(i >= k - 1) { // i is keeping track of the postion(index) 
							// k -1 is the last element is the boundary k
				maxValue = Math.max(maxValue, currentRunningSum);
				currentRunningSum -= arr[i - (k-1)]; // this is going to subtract the first element from the kth subarray pattern 
													// because now your inside the if statement and the next iteration is the 4th element
			}
		}
		return maxValue;
	}

}
