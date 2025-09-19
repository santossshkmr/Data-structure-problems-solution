package InterviewPractice;

import java.util.Arrays;

/*
 * You are given an array of integers arr[] where each element represents the number of 
 * chocolates in a packet. You are also given an integer m, which represents the number of students. 
 * The task is to distribute chocolate packets to m students such that:
Each student gets exactly one packet.
The difference between the packet with the maximum chocolates and the packet with the minimum 
chocolates given to students is minimized.
1 <= m <= n (number of students must be less than or equal to number of packets)
Input:
arr = [7, 3, 2, 4, 9, 12, 56]
m = 3 no of students
Output:
Minimum difference is 2
Explanation:
We can pick packets with 2, 3, and 4 chocolates. Max = 4, Min = 2, Difference = 2
Here is the Java implementation of the solution
 */
public class ChocolateDistributionProblem {
	
	public static void main( String[] args) {
		int[] arr = {7,3,2,4, 55, 55, 56};
		int m=3;
		if(arr == null || arr.length == 0 || m<=0 || m> arr.length  ){
			System.out.println("Not a valid case");
			return;
		}
		Arrays.sort(arr);
		for( int j=0;j<arr.length;j++) {
			System.out.print(" "+ arr[j]+"");
		}
		System.out.println();
		//we will be using sliding window concept to achieve desired output
		int n = arr.length;
		int mindiff = Integer.MAX_VALUE;
		System.out.println(mindiff);
		int initialIndex=0;
		// for sliding window we always take n-m+1 iteration if inclusive 
		for( int i=0; i<n-m+1;i++ ) {
			int diff = arr[m+i-1]-arr[i];
			if(diff<mindiff) {
				mindiff= diff;
				initialIndex = i;
			}
		}
		System.out.println("Minimum difference in chocolate:"+ mindiff);
		
		for( int j=initialIndex;j<initialIndex+m;j++) {
			System.out.print(" "+arr[j]);
		}
		
		
	}

}
