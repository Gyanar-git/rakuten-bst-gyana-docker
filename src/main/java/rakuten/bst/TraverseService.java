package main.java.rakuten.bst;

import java.util.LinkedList;
import java.util.Queue;

public class TraverseService {

	public void inOrder_sorted(final BNode root) {
		if (root != null) {
			inOrder_sorted(root.getLeft());
			print(root);
			inOrder_sorted(root.getRight());
		}

	}

	public void levelOrder(final BNode root) {

		Queue<BNode> fifo = new LinkedList<>();
		if (root == null) {
			return;
		}
		fifo.add(root);
		while (!fifo.isEmpty()) {
			BNode tmpNode = fifo.remove();
			if (tmpNode.getLeft() != null) {
				fifo.add(tmpNode.getLeft());
			}
			if (tmpNode.getRight() != null) {
				fifo.add(tmpNode.getRight());
			}
			print(tmpNode);
		}
	}

	public void postOrder(final BNode root) {
		if (root != null) {
			preOrder(root.getLeft());
			preOrder(root.getRight());
			print(root);
		}
	}

	public void preOrder(final BNode root) {
		if (root != null) {
			print(root);
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}

	}

	private void print(final BNode root) {
		System.out.print(root.getKeyValue() + " ");
	}

}
