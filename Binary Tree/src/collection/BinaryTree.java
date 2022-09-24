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

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	private int getSizeRecursive(BinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}

	public void printTree() {
		System.out.println("Binary Tree : " + root);
	}

	@Override
	public String toString() {
		return "Binary Tree { " + root + " }";
	}
}

