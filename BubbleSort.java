package InterviewPractice;

import java.util.Arrays;

public class BubbleSort {
	public static void main( String[] args) {
		//bubbleSort- a sorting technique where we compare two adjacent elements until all elements are sorted 
		 
		 int[] arr= {3,0,-1,2,4,8};
		 int n= arr.length;
		 for( int i=0;i<n;i++) {
			 boolean flag = false;
			 for(int j=0;j<n-1-i;j++) {
				 if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				 }
			 }
			 if(!flag) {
				 break;
			 }
		 }
		 System.out.println("sorted array:"+ Arrays.toString(arr));
	}
}
