package InterviewPractice;
//we are trying to rotate an array by some pivot value
// we will use various method to do these starting from worse case to optimal solution
public class ArrayRotation {
	public static void main(String[] args) {
		int[] arr = {5,6,8,9,12,44,45};
		int d=2; // rotate by 2 elements
//		int temp = arr[0];
//		for(int j=0;j<d;j++) {
//			for(int i=1;i<arr.length;i++) {
//				arr[i-1]=arr[i];
//			}
//			arr[arr.length-1]=temp;
//		}
//		
//		for( int i=0;i<arr.length;i++) {
//			System.out.print(" "+arr[i]);
//		}
		
		/*
		 * now we will use slightly better approach to rotate at once using a temp array
		 */
		int n=arr.length;
		int[] temp = new int[n];
		// store first d elements in temp
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		
		for(int j=0; j<n-d;j++) {
			arr[j]=arr[d+j];
		}
		
		for( int i=0;i<d;i++) {
			arr[n-d+i] = temp[i];
		}
		for( int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		
	}

}
