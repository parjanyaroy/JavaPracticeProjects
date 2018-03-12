
public class ColorFactoryBuilder extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		return null;
	}

	@Override
	Color getColor(String color) {
		if(color.equalsIgnoreCase("RED"))
			return new Red();
		else
			return new Blue();
		
	}

	
}
