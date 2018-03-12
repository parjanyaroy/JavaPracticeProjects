
public class Tester {

	public static void main(String[] args) {
		AbstractFactory shapefactory = FactoryCreator.getFactory("SHAPE");
		Shape s1 = shapefactory.getShape("CIRCLE");
		AbstractFactory colorfactory = FactoryCreator.getFactory("COLOR");
		Color c1 = colorfactory.getColor("RED");
		System.out.println((s1.drawShape()));
		System.out.println((c1.paintColor()));
	}

}
