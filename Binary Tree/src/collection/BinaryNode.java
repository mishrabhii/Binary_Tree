package collection;

public class BinaryNode<K extends Comparable<K>> {

	K key;
	BinaryNode<K> left;
	BinaryNode<K> right;


	public BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	@Override
	public String toString() {
		StringBuilder nodeString = new StringBuilder();
		nodeString.append("{ " + "Key = ").append(key).append(" }");

		if(left != null) {
			nodeString.append(" -> ").append(left);
		}
		if(right != null) {
			nodeString.append(" -> ").append(right);
		}
		return nodeString.toString();
	}
}
