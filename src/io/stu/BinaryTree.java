package io.stu;

public class BinaryTree {
	public enum TraversalType {
		FIRST, LAST
	}
	
	private BinaryTreeNode root;
	
	public BinaryTree(BinaryTreeNode root) {
		this.setRoot(root);
	}
	
	public BinaryTree() {
		
	}
	
	public void traverse(BinaryNodeAction fn) {
		this._traverse(TraversalType.FIRST, fn, this.root);
	}
	
	public void tailTraverse(BinaryNodeAction fn) {
		this._traverse(TraversalType.LAST, fn, this.root);
	}
	
	private void _traverse(TraversalType t, BinaryNodeAction fn, BinaryTreeNode n) {
		
		if(t == TraversalType.FIRST){
			fn.run(n);
		}
		
		if(n.getLeft() != null){
			_traverse(t, fn, n.getLeft());
		}
		
		if(n.getRight() != null){
			_traverse(t, fn, n.getRight());
		}
		
		if(t == TraversalType.LAST){
			fn.run(n);
		}
	}
	
	public void reverseHorizontally() {
		this.tailTraverse((n) -> {
			BinaryTreeNode left = n.getLeft();
			n.setLeft(n.getRight());
			n.setRight(left);
		});
	}
	
	/** Boring getters and setters **/
	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}
	
	public BinaryTreeNode getRoot() {
		return this.root;
	}
}
