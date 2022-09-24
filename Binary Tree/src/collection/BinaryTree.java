package collection;

public class BinaryTree<K extends Comparable<K>> {

	public static void main(String[] args) {
		System.out.println("Binary Tree Data Structure");

		BinaryTree<Integer> binaryTree = new BinaryTree<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		binaryTree.add(65);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(63);
		binaryTree.add(67);

		System.out.println("\nBinary Tree Size = " + binaryTree.getSize() + "\n");
		binaryTree.printTree();
		System.out.println("\nChecking '63' is present or not : " + binaryTree.searchNode(63));
		
	}
private BinaryNode<K> root;
	
	
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
		if(current == null)
			return new BinaryNode<K>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0)
			return current;
		if(compareResult < 0)
			current.left = addRecursively(current.left, key);
		else
			current.right = addRecursively(current.right, key);
		return current;
	}
	
	public boolean searchNode(K key) {
		return searchNodeRecursively(root, key);
	}
	
	private boolean searchNodeRecursively(BinaryNode<K> current, K key) {
		if(current == null)
			return false;
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return true;
		return compareResult < 0 ? searchNodeRecursively(current.left, key) : searchNodeRecursively(current.right, key);
	}

	public int getSize() {
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(BinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
	}
	
	public void printTree() {
		System.out.println("Binary Tree : " + root);
	}

	@Override
	public String toString() {
		return "Binary Tree { " + root + " }";
	}
}