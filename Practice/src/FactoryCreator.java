
public class FactoryCreator {

	public static AbstractFactory getFactory(String string) {
		if(string.equalsIgnoreCase("SHAPE"))
			return new ShapeFactoryBuilder();
		else
			return new ColorFactoryBuilder();
	}
	
	

}
