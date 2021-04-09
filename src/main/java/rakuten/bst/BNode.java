package main.java.rakuten.bst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A binary tree is a data structure which each node can have at most 2
 * children.
 *
 */
public class BNode {
	private int keyValue;
	private BNode left;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private BNode right;

	public BNode(final int value) {
		super();
		this.keyValue = value;
		this.left = null;
		this.right = null;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BNode other = (BNode) obj;
		if (keyValue != other.keyValue)
			return false;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		return true;
	}

	public int getKeyValue() {
		return keyValue;
	}

	public BNode getLeft() {
		return left;
	}

	public BNode getRight() {
		return right;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + keyValue;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		return result;
	}

	public void setKeyValue(final int value) {
		if (value != this.keyValue) {
			logger.info("Node:{} has a new key value {}", this.toString(), value);
			this.keyValue = value;
		}
	}

	public void setLeft(final BNode left) {
		if (left == null) {
			this.left = null;
		} else if (!left.equals(getLeft())) {
			logger.info("Node:{} sets new left_node:{}", this.toString(), (left == null ? null : left.toString()));
			this.left = left;
		}
	}

	public void setRight(final BNode right) {
		if (right == null) {
			this.right = null;
		} else if (!right.equals(getRight())) {
			logger.info("Node:{} sets new right_node:{}", this.toString(), (right == null ? null : right.toString()));
			this.right = right;
		}
	}

	@Override
	public String toString() {
		return "BinaryNode [keyValue=" + keyValue + ", left=" + left + ", right=" + right + "]";
	}

}
