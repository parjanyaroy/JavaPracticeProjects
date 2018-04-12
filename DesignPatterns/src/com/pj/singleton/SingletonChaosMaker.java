package com.pj.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonChaosMaker {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException {
		Singleton s1 = Singleton.getInstance();
		System.out.println("Original Singleton "+s1.hashCode());
		/* ********************* WAY TO BREAK WITH REFLECTION *********** */
		Singleton s3=null;
		Constructor[] con=Singleton.class.getDeclaredConstructors();
		for(Constructor c : con)
		{
			c.setAccessible(true);
			s3=(Singleton)c.newInstance();
		}
		System.out.println("Created with Reflection "+s3.hashCode());
		/* ********************* WAY TO BREAK WITH CLONING *********** */
		Singleton s4 = (Singleton) s1.clone();
		System.out.println("Created with Cloning "+s4.hashCode());
		/* ********************* WAY TO BREAK WITH SERIALIZATION ***** */
		FileOutputStream fos = new FileOutputStream("singletonBreaker");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		FileInputStream fis = new FileInputStream("singletonBreaker");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Singleton s5 = (Singleton) ois.readObject();
		System.out.println("Created with Serialization "+s5.hashCode());
	}

}
