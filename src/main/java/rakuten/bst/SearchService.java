package main.java.rakuten.bst;

public class SearchService {

	public BNode search(final BNode treeRoot, final int findingValue) {
		if (treeRoot == null) {
			return null;
		}

		if (findingValue == treeRoot.getKeyValue()) {
			return treeRoot;
		} else if (findingValue > treeRoot.getKeyValue()) {
			return search(treeRoot.getRight(), findingValue);
		} else {
			return search(treeRoot.getLeft(), findingValue);
		}

	}

	public Integer findMaxKey(final BNode root) {
		return root.getRight() == null ? root.getKeyValue() : findMaxKey(root.getRight());
	}

	public int findMinKey(final BNode root) {
		return root.getLeft() == null ? root.getKeyValue() : findMinKey(root.getLeft());
	}
}
