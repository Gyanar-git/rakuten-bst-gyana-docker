package main.java.rakuten.bst;

/**
 * A Binary search tree is a specific binary tree in which the left side node's
 * value is smaller than the root's value and the right side node's value is
 * greater than the root's value
 *
 */
public class BinarySearchTree {

	private BNode root;

	private InsertService insertSerivce = new InsertService();

	private SearchService searchService = new SearchService();

	public void add(final int value) {
		root = insertSerivce.add(root, value);
	}

	public BNode getRoot() {
		return root;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int max() {
		return searchService.findMaxKey(root);
	}

	public int min() {
		return searchService.findMinKey(root);
	}

	public BNode searchKey(final int findingValue) {
		return searchService.search(root, findingValue);
	}

	@Override
	public String toString() {
		return "BinarySearchTree [root=" + root + "]";
	}

}
