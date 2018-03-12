
public class Rectangle implements Shape {

	String name="Rectangle";
	
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
