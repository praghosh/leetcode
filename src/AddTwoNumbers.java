/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode l = null;
  	    int val1=0;
  	    int val2=0;
  	    int carryForward=0;
  	    int counter =0;
  	    ListNode currentNode=null;
    	while (l1!=null || l2!=null) {
    		if (l1==null) {
    			val1=0;
    		}
    		else {
    			val1=l1.val;
    			l1=l1.next;
    		}
    		if (l2==null) {
    			val2=0;
    		}
    		else {
    			val2=l2.val;
    			l2=l2.next;
    		}
    		int sum = val1 + val2 + carryForward;
    		if (sum>9) {
    			sum=sum%10;
    			carryForward =1;
    		}
    		else {
    			carryForward =0;
    		}
    		ListNode x = new ListNode (sum);
    		if (counter==0) {
    			  l = x;
    			  currentNode =l;
    		}
    		else {
    			currentNode.next=x;
    			currentNode=x;
    		}
    		counter++;
    	}
    	if (carryForward!=0) {
    		currentNode.next = new ListNode (carryForward);
    	}
  	   
  	     return l;
    }
    public static void main(String[] args) {
		
    	int arr1 [] = { 2,0,0,1 };
    	int arr2 [] = {9 };
    	ListNode l1 = ListNode.createListNodesFromArray (arr1);
    	ListNode l2 = ListNode.createListNodesFromArray (arr2);
    	ListNode.printNodeValues (l1);
     
    	ListNode l3 = new AddTwoNumbers ().addTwoNumbers(l1, l2);
    	ListNode.printNodeValues (l3);
	}
}
 

  class ListNode {
	       int val;
	       ListNode next;
	       ListNode() {};
	       ListNode(int val) { this.val = val; }
	       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	       
	       static ListNode createListNodesFromArray (int [] arr) {
	    	   
	    	   ListNode firstNode = new ListNode (arr[0]);
	    	   ListNode currentNode = firstNode;
	    	   for (int i = 1; i < arr.length; i++) {
	    		   ListNode x = new ListNode (arr[i]);
	    		   currentNode.next = x;
	    		   currentNode = x;
			   }
	    	   
	    	   return firstNode;
	    	   
	       }
	       
	       static void printNodeValues (ListNode l) {
	    	   
	    	   while (l!=null) {
	    		   System.out.println(l.val);
	    		   l =l.next;
	    		   
	    	   }
	       }
	       
	   }
  
  
  
  
  
  
  