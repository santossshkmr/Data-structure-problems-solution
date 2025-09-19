package InterviewPractice;

public class UniqueNumber {
	public static void main(String[] args) {
		int[] num = {2,2,8,8,20,20,37,90,90};
		int low=0, high=num.length-1;
		while(low<high) {
			int mid= (low+high)/2; //4, 7
			if(mid%2==1) { //true for 7
				mid--;
			}
			if(num[mid] == num[mid+1]) { //true for mid=4,
				low = mid+2; //6 
			} else {
				high = mid;
			}
		}
		System.out.println( num[low]);
	}

}
