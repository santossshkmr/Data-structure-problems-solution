package InterviewPractice;

//import java.util.Arrays;
import java.util.*;

public class SearchAnElement {
	public static void main( String[] args) {
		int[] arr = {4,5,6,3,6,8,9,99};
		int k=990;
		int index=0;
		//Arrays.sort(arr);
		//using naive approach where will look for key value in array using an loop
		// for unsorted array and this will work fine for 1-2 element search but if we want to search multiple
		//elements then we use hashmap/hashset.
//		for( int i=0;i<arr.length; i++ ) {
//			if(arr[i]==k) {
//				index=i;
//				System.out.println("key found");
//				break;
//			}
//		}
//		System.out.println( "index of key in array: "+ index );
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=0;i<arr.length;i++) {
//			if( !map.containsKey(arr[i])) {
//			map.put(arr[i], i);
//			}
//			
//		}
//		if( map.containsKey(k)) {
//			index=map.get(k);
//			System.out.println("element found at index:"+index);
//		} else {
//			System.out.println("element not found");
//		}
		
		/*
		 * we use hashSet also but we will not able to identify the index
		 */
		HashSet<Integer> set = new HashSet<>();
		for(int num: arr) {
			set.add(num);
		}
		if(set.contains(k)) {
			System.out.println("element found");
			
		} else {
			System.out.println("element not found");
		}
		
	}

}
