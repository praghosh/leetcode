package biWeeklyCode14thMay2022;

public class ValidSplits {


	public static int waysToSplitArray(int[] nums) {

		int ways=0;

		long sum=0;

		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		long splitSum =0;

		for (int i = 0; i < nums.length-1; i++) {
			splitSum+=nums[i];
			
			if (splitSum >= (sum -splitSum)) {
				ways++;
			}
		}


		return ways;

	}
	public static void main(String[] args) {
		int arr []   = {1,-2,3,-2};
		System.out.println(waysToSplitArray (arr));
	}

}
