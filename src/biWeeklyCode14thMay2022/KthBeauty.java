package biWeeklyCode14thMay2022;

public class KthBeauty {
	
	   public static int divisorSubstrings(int num, int k) {
	        int divisor=0;
	        
	        String numberString =  num +"";
	        
	        for (int i = 0; i < numberString.length()-k +1; i++) {
	        	
	        	String subStringOfLengthK = numberString.substring(i, i+k);
	        	int numOfLengthK = Integer.parseInt(subStringOfLengthK);
	        	if (numOfLengthK==0) {
	        		continue;
	        	}
	        	if (num%numOfLengthK==0) {
	        		divisor++;
	        	}
				
			}
	        
	        
	        return divisor;
	    }
	   public static void main(String[] args) {
		    System.out.println(  divisorSubstrings (22,1));
	}

}
