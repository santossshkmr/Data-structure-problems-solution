package InterviewPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ContainsDuplicate {
	
	public static void main( String[] args) {
		int[] arr = {3,4,5,6,2,5};
		int n = arr.length;
		boolean flag = false;
		// Naive approach with O(n2) complexity 
//		for( int i=0; i<n; i++ ) {
//			for( int j=i; j<n; j++ ) {
//				if( arr[i]==arr[j]) {
//					flag = true;
//					break;
//				}}
//		}
//		if( flag == false ) {
//			System.out.println(" Does not Conains Duplicate");
//		} else {
//			System.out.println("Conains Duplicate");
//		}
		// using Hash map with O(n) complexity but if we only wants to know if duplicate
		//exists or not only then HashSet will work better here
//		Map<Integer,Integer> freq = new HashMap<>();
//		for(int i=0;i<n;i++) {
//			freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1 );
//		}
//		for( Map.Entry<Integer, Integer> entry : freq.entrySet() ) {
//			if( entry.getValue() > 1) {
//				System.out.print("Conatins Duplicate and value:" +entry.getKey());
//			}
//		}		
		//Using hashset for optimal solution
		HashSet<Integer> set = new HashSet<>();
		for( int num : arr ) {
			if( !set.add(num)) {
				System.out.println("Conatins duplicate");
				return;
			}
		}
		System.out.println("Does not Conatins duplicate");
	}

}
