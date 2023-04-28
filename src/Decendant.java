
public class Decendant {
	
    public long getDescentPeriods(int[] prices) {
    	long total = prices.length;
    	
    	
    	
    	if (total==1) {
    		return 1;
    	}
    	long decreasingLength=0;
    	
    	for (int i = 1; i < prices.length; i++) {
    		
			
    		if ((prices[i]-prices[i-1]) ==-1) {
				decreasingLength++;
				total+=decreasingLength;
			}
    		else {
				decreasingLength=0;;
    		}
    		
		}
    	
      	
    	return total;
        
    }
    public static void main(String[] args) {
    	int [] arr = {8,6,7,7,6,5};
		System.out.println(new Decendant ().getDescentPeriods (arr));
	}

}
