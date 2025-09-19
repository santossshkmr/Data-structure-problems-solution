package InterviewPractice;

//we can do this problem using divide and conquer approach but Kadane algorithm solved this with least complexity
public class MaxSumSubArray {
	public static void main( String[] args) {
		int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
;
		
		//using Kadane algorithm
		int maxSofar = arr[0];  //keeps track of the overall max sum found so far
		int currentMax = arr[0]; //tracks the maximum sum ending at current index
		
		int start = 0; //track the actual subarray start indices with the max sum
		int end = 0;	// track the actual subarray end indices with the max sum
		int tempStart= 0; // we reset the subarray starting point (tempStart) when a new subarray start
		for( int i=1;i<arr.length;i++ ) {
			if(arr[i]> currentMax + arr[i]) {
				currentMax = arr[i];
				tempStart=i;
			} else {
				currentMax = currentMax + arr[i];
			}
			if( currentMax > maxSofar ) {
				maxSofar = currentMax;
				start = tempStart;
				end = i;
			}
			
		}
		System.out.println( "Max sum= "+ maxSofar);
		for( int i=start; i<=end;i++) {
			System.out.print( arr[i]+ " " );
		}
	}
}
