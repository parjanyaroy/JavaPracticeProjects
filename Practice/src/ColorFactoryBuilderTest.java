import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mock;

public class ColorFactoryBuilderTest {
	ColorFactoryBuilder testInstance = new ColorFactoryBuilder();
	@Mock
	Shape shape;
	@Test
	public void testGetColor() {
		
	assertEquals(new Red(), testInstance.getColor("Red"));
	assertEquals(new Red(), testInstance.getColor("Red").paintColor());
	assertEquals(shape,testInstance.getShape("RECTANGLE"));
	}

}
