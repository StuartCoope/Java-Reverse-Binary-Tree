import io.stu.BinaryTreeNode;
import io.stu.BinaryNodeAction;
import io.stu.BinaryTree;

/*
 * Solution for following problem:
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class main {

	public static void main(String[] args) {
		
		BinaryTree t = new BinaryTree(
			new BinaryTreeNode("root")
				.setLeft(
					new BinaryTreeNode("a")
						.setLeft(new BinaryTreeNode("1"))
						.setRight(new BinaryTreeNode("2"))
				)
				.setRight(
					new BinaryTreeNode("b")
						.setLeft(new BinaryTreeNode("3"))
						.setRight(new BinaryTreeNode("4"))
				)
		);
		
		
		t.traverse((n) -> System.out.println(n));
		t.reverseHorizontally();
		t.traverse((n) -> System.out.println(n));
		
	}

}
