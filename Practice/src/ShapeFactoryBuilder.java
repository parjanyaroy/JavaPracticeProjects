
public class ShapeFactoryBuilder extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else
			return new Rectangle();
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
