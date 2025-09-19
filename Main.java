package InterviewPractice;

import java.util.*;
public class Main {
	public static void main( String[] args ) {
//		String word = "Santosh Kumar";
//		//convert to lower case
//		word = word.toLowerCase();
//		//Create a map to store the character frequency
//		Map<Character, Integer> freq = new HashMap<>();
//		
//		for( char c: word.toCharArray()) {
//			if( Character.isLetter(c)) {
//				freq.put(c, freq.getOrDefault(c, 0)+1 );
//			}
//		}
//		for( Map.Entry<Character, Integer> entry : freq.entrySet() ) {
//			System.out.println(entry.getKey()+ "->" + entry.getValue());
//		}
		String word = "NTTDATA";
		int[] freq = new int[256];
		for(char c: word.toCharArray()) {
			freq[c]++;
			
		}
		for(int i=0; i<word.length();i++) {
			if(freq[i] > 0) {
				System.out.println((char) i + "->"+freq[i]);
			}
		}
		
	}

}
