package utils;

import java.util.Set;

import org.reflections.Reflections;

import model.IFruct;

public class ScanPackage {
	
	
	public static void detectClasses(String packageName) {
		Reflections reflections = new Reflections(packageName);
		 Set<Class<? extends IFruct>> subTypes =
	                reflections.getSubTypesOf(IFruct.class);
		
		 System.out.println(subTypes);
	}

}
