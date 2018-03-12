
public class Circle implements Shape {

	String name="Circle";
	
	@Override
	public Shape drawShape() {
		return this;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
