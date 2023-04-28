import java.util.Arrays;
import java.util.HashMap;
/**
 * 
 * @author prabir
 * 
 * This problem is from leet code.
 * Url of the submission : https://leetcode.com/problems/two-sum/submissions/941178346/
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		
		int arr []   = {1, 2, 6,0, 6 , 3, 6 , 8, 5};
		TwoSum obj = new TwoSum ();
		System.out.println(Arrays.toString(obj.twoSum (arr, 13)));
		

	}

	public int[] twoSum(int[] nums, int target) {

		int outArray[]= new int [2];

		HashMap <Integer, Integer> numMap = new HashMap <Integer, Integer> ();
		for (int index=0; index < nums.length; index++ ) {
			int val = nums[index];
			int remaining= target-val;

			if (numMap.containsKey(remaining)){
				outArray[0] = numMap.get(remaining);
				outArray[1] = index;
				break;
			}
			numMap.put(val, index);

		}


		return outArray;


	}


}
