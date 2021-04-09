package test.java.rakuten.bst;

import static org.junit.Assert.assertTrue;

import main.java.rakuten.bst.BinarySearchTree;
import main.java.rakuten.bst.InsertService;
import main.java.rakuten.bst.SearchService;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {
	protected BinarySearchTree bst = new BinarySearchTree();
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	protected SearchService searchService = new SearchService();

	protected InsertService insertService = new InsertService();

	@Rule
	public TestName testName = new TestName();

	@Before
	public void setup() {
		assertTrue(bst.isEmpty());
		logger.info("Start {}", testName.getMethodName());
	}

	@After
	public void cleanup() {
		logger.info("End {}", testName.getMethodName());
	}
}
