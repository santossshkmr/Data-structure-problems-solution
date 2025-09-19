package InterviewPractice;

import java.util.Arrays;

public class MaxMin {
	public static void main( String[] args) {
		int[] arr = {3,5,3,4,99,5,8,-2};
		//int min=arr[0], max=arr[0];
//		for( int i=0;i<arr.length;i++) {
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//			
//		}
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("MAX = "+max+" MIN = "+ min);
	}

}
