package test.java.rakuten.bst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import main.java.rakuten.bst.BNode;
import org.junit.Test;

public class SearchServiceTest extends TestBase {

	@Test
	public void test_search_node() {
		BNode root = insertService.add(null, 6);

		insertService.add(root, 4);
		insertService.add(root, 2);
		insertService.add(root, 10);

		BNode found12 = searchService.search(root, 22);
		assertNull(found12);

		BNode found2 = searchService.search(root, 2);
		assertNotNull(found2);
		assertEquals(2, found2.getKeyValue());

		int max = searchService.findMaxKey(root);
		assertEquals(10, max);

		int min = searchService.findMinKey(root);
		assertEquals(2, min);

	}

}
