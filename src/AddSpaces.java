import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class AddSpaces {

	public String addSpaces(String s, int[] spaces) {


		StringBuilder sb = new StringBuilder(s);
		int counter=0;
		for (int i = 0; i < spaces.length; i++) {
			sb.insert(spaces[i]+counter, ' ');
		    counter++;
		}
 		return sb.toString();
	}
	public static void main(String[] args) {
		int []   x = {8,13,15};
		String s = "LeetcodeHelpsMeLearn";
		System.out.println(new AddSpaces().addSpaces (s,x));

	}

}
