package InterviewPractice;
//binary search is best for searching a key or multiple key from a sorted array.
public class BinarySearch {
	public static void main( String[] args) {
		int[] arr = {2,4,5,6,7,8,9};
		int key=0,index=0;
		int low=0, high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid] == key) {
				index=mid;
				System.out.println("Element found at index:"+ index);
				return;
			} else if(arr[mid]<key) {
				low=mid+1;
			} else {
				high= mid-1;
			}
		}
		if(index==0) {
			System.out.println("Element Not found");	
		}
	}
	

}
