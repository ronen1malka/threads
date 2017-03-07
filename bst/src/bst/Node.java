package bst;

public class Node {
	int key;
	String name;
	Node leftChild;
	Node rightChild;

	public Node(int key,String name){
		this.key = key;
	}

	public String toString(){
		
		return "Node " + this.name + " has a key of " + this.key;
	}
}
