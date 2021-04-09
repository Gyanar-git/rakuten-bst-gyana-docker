package test.java.rakuten.bst;

import main.java.rakuten.bst.TraverseService;
import org.junit.Test;

public class TraverseServiceTest extends TestBase {

	private TraverseService traversrv = new TraverseService();

	@Test
	public void testLevelOrder() {

		buildTree();

		logger.info("\nlevelOrder -Should print as 6 4 8 3 5 7 9 2 10");
		traversrv.levelOrder(bst.getRoot());

	}

	@Test
	public void testInOrder() {

		buildTree();

		logger.info("\ninOrder-Should print as 2 3 4 5 6 7 8 9 10 - ordered");
		traversrv.inOrder_sorted(bst.getRoot());

	}

	@Test
	public void testPreOrder() {

		buildTree();

		logger.info("\npreOrder-Should print as 6 4 3 2 5 8 7 9 10 - same order as the insert order");
		traversrv.preOrder(bst.getRoot());

	}

	@Test
	public void testPostOrder() {

		buildTree();

		logger.info("\npostOrder-Should print as 4 3 2 5 8 7 9 10 6");
		traversrv.postOrder(bst.getRoot());

	}

	private void buildTree() {
		bst.add(6);
		bst.add(4);
		bst.add(8);
		bst.add(3);
		bst.add(5);
		bst.add(7);
		bst.add(9);
		bst.add(2);
		bst.add(10);
	}

}
