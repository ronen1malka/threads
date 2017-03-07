package bst;
// http://www.geeksforgeeks.org/binary-search-tree/
public class BinaryTree {
	Node root;

	public void AddNode(String name, int key) {
		Node newNode = new Node(key, name);
		if (this.root == null) {
			this.root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			while (true) {
				parent = focusNode;
				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}

				}
			}
		}
	}

	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		bst.AddNode("node 1", 50);
	}

}
