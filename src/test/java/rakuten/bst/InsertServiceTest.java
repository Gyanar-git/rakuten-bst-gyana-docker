package test.java.rakuten.bst;

import static org.junit.Assert.assertEquals;

import main.java.rakuten.bst.BNode;
import org.junit.Test;

public class InsertServiceTest extends TestBase {

 
	@Test
	public void test_add_4_nodes() {
		BNode root = insertService.add(null, 6);
		assertEquals(6, root.getKeyValue());

		insertService.add(root, 4);
		assertEquals(4, root.getLeft().getKeyValue());

		insertService.add(root, 2);
		assertEquals(2, root.getLeft().getLeft().getKeyValue());

		insertService.add(root, 10);
		assertEquals(10, root.getRight().getKeyValue());

	}

}
