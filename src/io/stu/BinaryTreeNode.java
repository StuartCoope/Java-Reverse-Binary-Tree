package io.stu;

public class BinaryTreeNode {
	
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	private String value;
	
	public BinaryTreeNode(String value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public String toString() {
		return this.getValue();
	}
	
	/** Boring getters and setters **/
	public BinaryTreeNode getLeft() {
		return left;
	}

	public BinaryTreeNode setLeft(BinaryTreeNode left) {
		this.left = left;
		return this;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public BinaryTreeNode setRight(BinaryTreeNode right) {
		this.right = right;
		return this;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
