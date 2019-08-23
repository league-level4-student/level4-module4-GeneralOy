package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulationTest {
	EncapsulateTheData En = new EncapsulateTheData();

	@Test
	public void testItemsReceived() {
		En.receiveItems(15);
		assertEquals(15, En.getItemsReceived());
		En.receiveItems(2);
		assertEquals(2, En.getItemsReceived());
		En.receiveItems(127);
		assertEquals(127, En.getItemsReceived());
		En.receiveItems(0);
		assertEquals(0, En.getItemsReceived());
		En.receiveItems(1);
		assertEquals(1, En.getItemsReceived());
		En.receiveItems(-15);
		assertEquals(0, En.getItemsReceived());
		En.receiveItems(-5);
		assertEquals(0, En.getItemsReceived());
	}

	@Test
	public void testDegreesTurned() {
		En.turnXDegrees((float) 25.3);
		assertEquals((float) 25.3, En.getDegreesTurned());
		En.turnXDegrees((float) 2.673);

		assertEquals((float) 2.673, En.getDegreesTurned());
		En.turnXDegrees((float) 720);
		assertEquals((float) 0, En.getDegreesTurned());
		//////////////////////// math hello?
		En.turnXDegrees((float) 395.4);

		assertEquals((float) 35.4, En.getDegreesTurned(), 0.001);
		/**when using doubles, need to add a third parameter telling computer the level of accuracy wanted*/
		En.turnXDegrees((float) -30.0);
		assertEquals((float) 330.0, En.getDegreesTurned());
		En.turnXDegrees((float) -420.6);
		assertEquals((float) 299.4, En.getDegreesTurned());
	}

	@Test
	public void testNomenclature() {
		En.setNomenclature("test");
		assertEquals("test", En.getNomenclature());
		En.setNomenclature("hello");
		assertEquals("hello", En.getNomenclature());
		En.setNomenclature("a");
		assertEquals("a", En.getNomenclature());
		En.setNomenclature("");
		assertEquals(" ", En.getNomenclature());
	}

	@Test
	public void testMemberObject() {
		String test = "test";
		Object objTest = new Object();
		int intTest = 1;
		En.setMemObj(test);
		assertEquals(objTest.getClass(), En.getObj().getClass());
		En.setMemObj(objTest);
		assertEquals(objTest, En.getObj());
		En.setMemObj(intTest);
		assertEquals(intTest, En.getObj());
	}
}
