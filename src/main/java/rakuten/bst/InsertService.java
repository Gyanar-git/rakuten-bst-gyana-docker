package main.java.rakuten.bst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InsertService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public BNode add(final BNode treeRoot, final int addingValue) {
		if (treeRoot == null) {
			logger.info("Create a new leaf node with key value:{} ", addingValue);
			return new BNode(addingValue);
		}

		if (addingValue < treeRoot.getKeyValue()) {
			treeRoot.setLeft(add(treeRoot.getLeft(), addingValue));
		} else if (addingValue == treeRoot.getKeyValue()) {
			return treeRoot;
		} else {
			treeRoot.setRight(add(treeRoot.getRight(), addingValue));
		}

		return treeRoot;
	}

}