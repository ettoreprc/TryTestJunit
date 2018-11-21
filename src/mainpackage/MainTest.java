package mainpackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {

	private static OggettoProva main = new OggettoProva(); 
	
	@BeforeClass 
	public static void initMyMain () {
	} 
	
	@Test
	public void testSecondElement () {
		assertEquals( "String1"  , main.getElement(1) );
	}
	
	@Test(expected= IndexOutOfBoundsException.class)
	public void outOfBoundException () {
		new OggettoProva().getElement(11) ; 
		
	}
}
