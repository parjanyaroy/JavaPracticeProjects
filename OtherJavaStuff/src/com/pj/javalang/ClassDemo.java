package com.pj.javalang;

public class ClassDemo {

	int i;
	
	
  /* Using this contructor will remove default constructor and result in 
   *  java.lang.InstantiationException
   * public ClassDemo(int i) {
		super();
		this.i = i;
	}*/


public static final void main(String[] args) throws InstantiationException, IllegalAccessException {

      try {
         Class cls = Class.forName("com.pj.javalang.ClassDemo");
         Object newInstance = cls.newInstance();

         // returns the ClassLoader object
         ClassLoader cLoader = cls.getClassLoader();
       
         /* returns the Class object associated with the class or interface 
            with the given string name, using the given 'classloader. */
         Class cls2 = Class.forName("java.lang.Thread", true, cLoader);       
       
         // returns the name of the class
         System.out.println("Class = " + cls.getName());
         System.out.println("Class = " + cls2.getName()); 
      } catch(ClassNotFoundException ex) {
         System.out.println(ex.toString());
      }
   }
}