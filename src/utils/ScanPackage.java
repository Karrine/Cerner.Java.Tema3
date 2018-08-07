package utils;

import java.util.Set;

import org.reflections.Reflections;

import model.IFruct;

public class ScanPackage {
	
	
	public static Set<Class<? extends IFruct>> detectClasses(String packageName) {
		Reflections reflections = new Reflections(packageName);
		 Set<Class<? extends IFruct>> subTypes =
	                reflections.getSubTypesOf(IFruct.class);
		 System.out.println(subTypes);
		  return reflections.getSubTypesOf(IFruct.class);
		 
	}

}
