
public class Experiments {

	public static void main(String[] args) {
		try
		{
		throw new StackOverflowError("Stack is full");
		}
		catch(StackOverflowError s)
		{
		System.out.println(s.getMessage());	
		}

	}

}
