package weeklyJuly3rd2022;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static String decodeMessage(String key, String message) {

		Map  <Character, Character> alphabetMap= new HashMap <Character, Character> () ;

		// Fill the map traversing input key
		char currentChar = 'a'; 
		for (int i = 0; i < key.length (); i++) {

			if ( (alphabetMap.get(key.charAt(i)) == null) && 
					key.charAt(i)!=' ' ) 
			{
				alphabetMap.put(key.charAt(i), currentChar);
				currentChar++;
			}
		}
		String decryptedMessage ="";
		for (int i = 0; i < message.length (); i++) {
			if (message.charAt(i)==' ') {
				decryptedMessage+=' ';	
			} else {
				decryptedMessage+=alphabetMap.get(message.charAt(i) );	
			}

		}

		return decryptedMessage;
	}



	public static int[][] spiralMatrix(int m, int n, ListNode head) {

		int [][] outputMatrix = new int [m][n];
		boolean [][] visited = new boolean [m][n];

		// Fill the value with -1
		for (int i = 0; i <m; i++) {
			for (int j = 0; j < n; j++) {
				outputMatrix [i][j]=-1;
				visited [i][j]=false;
			}
		}


		int row=0;
		int col=0;
		int direction =0; // {RIGHT,DOWN,LEFT,UP};
		while (true)  {
			// Change direction if required 
			if (row==m || col ==n || row ==-1 || col ==-1 || visited [row][col]  ) {
				direction = (direction +1)%4;
				switch  (direction) {

				case 0:
					row++; 								
					break;

				case 1:
					col++;
					break;

				case 2:
					row--;
					break;

				case 3:
					col--;
					break;

				}
				continue;
			}
			ListNode nextNode =  head.next;
			if (nextNode==null) break;
			outputMatrix[row][col] = nextNode.val;
			visited [row][col] =true;
			
     	}

		return outputMatrix;

	}









	public static void main(String[] args) {
		System.out.println(decodeMessage ("the quick brown fox jumps over the lazy dog",
				"vkbs bs t suepuv"));

		ListNode node1 = new ListNode (5);
		ListNode node2 = new ListNode (3);
		ListNode node3 = new ListNode (10);
		ListNode node4 = new ListNode (1);
		ListNode node5 = new ListNode (2);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		spiralMatrix (3, 3, node1) ;

	}
}
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


