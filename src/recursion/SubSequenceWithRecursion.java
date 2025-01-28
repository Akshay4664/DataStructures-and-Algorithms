package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceWithRecursion {
	
	public static void subsequence(int idx, List<Integer> result, int[] arr) {
		if(idx >= arr.length) {
			System.out.println(result);
			return;
		}
		
		result.add(arr[idx]);
		subsequence(idx+1, result, arr);
		result.remove(result.size()-1);
		subsequence(idx+1, result, arr);
	}

	public static void main(String[] args) {
		int[] arr = {3,1,2};
		int n = arr.length;
		
		List<Integer> result = new ArrayList<Integer>();
		
		subsequence(0, result, arr);

	}

}
