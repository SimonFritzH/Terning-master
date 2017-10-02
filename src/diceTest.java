import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Mathias Thejsen & Simon Fritz
 *
 */
public class diceTest extends Dice {

	/**
	 * Test method for {@link Dice#rollMultiple(int)}.
	 */
	@Test
	public void testRollMultipleforones() {
		int value = collector(1,60000);
		assertTrue(9600 <=value&&value<=10400);
	}

	
	/**
	 * Test method for {@link Dice#rollMultiple(int)}.
	 */
	@Test
	public void testRollMultiplefortwos() {
		int value = collector(2,60000);
		assertTrue(9600 <=value&&value<=10400);
	}
	
	
	/**
	 * Test method for {@link Dice#rollMultiple(int)}.
	 */
	@Test
	public void testRollMultipleforthrees() {
		int value = collector(3,60000);
		assertTrue(9600 <=value&&value<=10400);
	}
	
	/**
	 * Test method for {@link Dice#rollMultiple(int)}.
	 */
	@Test
	public void testRollMultipleforfours() {
		int value = collector(1,60000);
		assertTrue(9600 <=value&&value<=10400);
	}
	
	
	/**
	 * Test method for {@link Dice#rollMultiple(int)}.
	 */
	@Test
	public void testRollMultipleforfives() {
		int value = collector(1,60000);
		assertTrue(9600 <=value&&value<=10400);
	}
	
	
	/**
	 * Test method for {@link Dice#rollMultiple(int)}.
	 */
	@Test
	public void testRollMultipleforsixs() {
		int value = collector(1,60000);
		assertTrue(9600 <=value&&value<=10400);
	}
	

}
