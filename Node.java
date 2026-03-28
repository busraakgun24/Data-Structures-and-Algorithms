package faktoriyel;

public class Node {
	int data;
	int faktoriyelSonuc;//Sayının faktöriyelini de içinde tutalım.
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
