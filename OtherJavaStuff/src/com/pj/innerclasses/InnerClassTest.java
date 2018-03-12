package com.pj.innerclasses;
import java.util.Arrays;
//nested classes can be used in import for easy instantiation

import com.pj.innerclasses.OuterClass.InnerClass;
import com.pj.innerclasses.OuterClass.StaticNestedClass;

public class InnerClassTest {

  public static void main(String[] args) {
      OuterClass outer = new OuterClass(1,2,3,4);
      
      //static nested classes example
      StaticNestedClass staticNestedClass = new StaticNestedClass();
      StaticNestedClass staticNestedClass1 = new StaticNestedClass();
      
      System.out.println("staticNestedClass.getName():"+staticNestedClass.getName());
      staticNestedClass.d=10;
      System.out.println("staticNestedClass.d:"+staticNestedClass.d);
      System.out.println("staticNestedClass1.d:"+staticNestedClass1.d);
      
      //inner class example
      InnerClass innerClass = outer.new InnerClass();
      System.out.println("innerClass.getName():"+innerClass.getName());
      System.out.println("innerClass:"+innerClass);
      innerClass.setValues(); // values are set from variables in outer class
      System.out.println("innerClass:"+innerClass);
      
      //calling method using local inner class
      outer.print("Logger");
      
      //calling method using anonymous inner class
      System.out.println(Arrays.toString(outer.getFilesInDir("src/com/journaldev/nested", ".java")));
      
      System.out.println(Arrays.toString(outer.getFilesInDir("bin/com/journaldev/nested", ".class")));
  }

}