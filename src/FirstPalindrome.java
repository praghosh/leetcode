 

public class FirstPalindrome {

	public String firstPalindrome(String[] words) {
		String output ="";

		for (int i = 0; i < words.length; i++) {

			if (isPalindrome (words[i]) ){
				return words[i];
			}
		}


		return output;

	}

	private boolean isPalindrome(String string) {
		 
		int totalLength = string.length ();
		if (totalLength<=1)  {
			return true;
		}
			
		int half = totalLength/2;
		for (int i = 0; i < half; i++) {
			
			if (string.charAt(i) != string.charAt(totalLength-i-1)) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new FirstPalindrome ().isPalindrome("XA"));
		System.out.println(new FirstPalindrome ().isPalindrome("ABBA"));
		System.out.println(new FirstPalindrome ().isPalindrome("ABCBA"));
	}
}
