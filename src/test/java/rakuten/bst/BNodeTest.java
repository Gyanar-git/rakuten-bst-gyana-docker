package test.java.rakuten.bst;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import main.java.rakuten.bst.BNode;
import org.junit.Test;

public class BNodeTest {
	BNode bNode = new BNode(1);

	@Test
	public void test_leaf_node() {
		assertEquals(1, bNode.getKeyValue());
		assertNull(bNode.getLeft());
		assertNull(bNode.getRight());
		System.out.println(bNode.toString());
	}

	
	@Test
	public void test_has_left_node() {
		bNode.setLeft(new BNode(0));
		assertEquals(1, bNode.getKeyValue());
		assertNotNull(bNode.getLeft());
		assertEquals(0, bNode.getLeft().getKeyValue());
		System.out.println(bNode.toString());
	}
	
	@Test
	public void test_has_right_node() {
		bNode.setRight(new BNode(3));
		assertEquals(1, bNode.getKeyValue());
		assertNotNull(bNode.getRight());
		assertEquals(3, bNode.getRight().getKeyValue());
		System.out.println(bNode.toString());
	}
	
	@Test
	public void test_has_two_nodes() {
		bNode.setLeft(new BNode(0));
		bNode.setRight(new BNode(3));
		assertEquals(0, bNode.getLeft().getKeyValue());
		assertEquals(3, bNode.getRight().getKeyValue());
		System.out.println(bNode.toString());
	}
}
