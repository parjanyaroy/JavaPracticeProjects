package com.lambda;

public class LambdaMisc {
	
	public static void main(String[] args) {
	
		// Assigning a block of code to a variable
		/**
		 * aBlockOfCode=public void perform() {
			System.out.println("Hello World");
			}
		*	THE FUNCTION IS MODIFIED IN THE FOLLOWING WAY
		*
		*	public is removed because it gives the context of class
			but this method is in isolation so public is not required
		*	perform is the function call but its not required because
			the function is already defined
		*	return type is also removed because the return type can be 
			automatically determined by looking at the function
		*
		*	-> should be given to signify its a labda . FINAL FUNCTION WILL BE
		*
		*	aBlockOfCode=()->{
			System.out.println("Hello World");
			}
			
			OR ( for single line)
			
			aBlockOfCode=()->System.out.println("Hello World");
							
			Examples:
			
			1>Passing the lambda expression variable to the greet Method
			greet(aBlockOfCode)
			OR(Inline passing)
			greet(()->System.out.println("Hello World"));
			
			2>Function with parameters
			
			doubleANumber=(int x)->2*x;
			
			For single line function 'return' keyword is not needed
			but for multiline, braces and return keyword is required.
			
			addTwoNumbers=(int a,int b)-> a+b;
			
			safeDivideFunction=(int a,int b)->
								{ if(b!=0)
								return a/b;
								else
								return 0;
								};
								
			stringLengthCount =(String a) -> a.length();
			
			3>Since the signature of the lambda is already defined in the
			Functional Interface,specifying the parameter type is not required.
			
			4>For Single Argument Lambdas the () braces can also be removed.So
			the above expression becomes
			
			stringLengthCount = a -> a.length();
			
		*/
		
		// Following are the three ways of defining implementation of Greeting interface
		// 1. By Actual Implementation
		Greeting g1 = new GreetingImpl();
		
		System.out.println("-------------");
		System.out.println(g1.sayHello());
		System.out.println(g1.sayHi());
		g1.sayHello();
		System.out.println("-------------");
		// 2. By Anonymous Inner Class
		Greeting g2 = new Greeting(){
			public void perform()
			{
				System.out.println("Hello2");
			}
		};
		// 3. By Lambda Expression
		Greeting g3 = ()->System.out.println("Hello3");
		
		LambdaMisc l1 = new LambdaMisc();
		l1.performAction(g1);
		l1.performAction(g2);
		l1.performAction(g3);
		// Attempting to use runnable with lambda exp as it is a functional interface
		//Runnable r1 = ()-> new ThreadFunction().someFunction();
		//Thread t1 = new Thread(r1);
		Thread t1 = new Thread(()-> new ThreadFunction().someFunction());
		t1.start();
		
	}
	
	void performAction(Greeting g)
	{
		g.perform();
	}

}
