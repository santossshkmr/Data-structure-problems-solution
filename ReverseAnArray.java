package InterviewPractice;

import java.util.*;

public class ReverseAnArray {

	public static void main(String[] args) {
		//using collections
		//Integer[] arr = {4,8,9,0,20};
//		List<Integer> list = Arrays.asList(arr);
//		Collections.sort(list);
//		Collections.reverse(list);
//		System.out.println("Reversed Arr "+list);
//		
//		// tradional way - using extra array
		int[] arr = {3,5,4,7,9,0};
		Arrays.sort(arr);
		int n =arr.length;
		int[] temp = new int[n];
		
		for(int i=arr.length-1,j = 0; i>=0;i--,j++) {
			temp[j]=arr[i];
		}
		System.out.println(Arrays.toString(temp));
		
//		int[] arr = {4,9,0,-10,57};
//		int left=0, right= arr.length-1;
//		 while(left<right) {
//			 int temp = arr[left];
//			 arr[left]=arr[right];
//			 arr[right]=temp;
//			 left++;
//			 right--;
//		 }
//		 System.out.println(Arrays.toString(arr));
		
	}
}
