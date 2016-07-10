package main;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	
	public static void main(String[] args) {
		
//		The class that you want to get the metainformation
	    Class<SomeClass> classe = SomeClass.class;
	    
	    
	    System.out.println("\n- List of Fields:");
	    Field[] fields = classe.getDeclaredFields();
		for (Field atributo: fields) {
			System.out.println(atributo.getName());      
		}
		
		
		System.out.println("\n- List of Methods:");
		Method[] methods = classe.getMethods();
		for (Method metodo: methods) {
			System.out.println(metodo.getName());      
		}
		
		
		System.out.println("\n- List of Methods with the Info's annotation:");
		methods = classe.getMethods();
		for (Method metodo: methods) {			
			Info info = metodo.getAnnotation(Info.class);
			
			if(info != null){
				System.out.println(metodo.getName());
				
				System.out.println(" Name: " + info.name());
				System.out.println(" Date: " + info.date());
				System.out.println(" Version: " + info.version());
				
				System.out.println(" People:");				
				String[] people = info.people();
				for(String person: people){
					System.out.println("  " + person);					
				}
				
			}

//			if(metodo.isAnnotationPresent(Info.class)){
//				System.out.println("it has Info's annotation");
//			}else{
//				System.out.println("it has not Info's annotation");
//			}	
	    
		}
		
		
		System.out.println("\n- Executing the List of Methods with the Info's annotation:");
		SomeClass obj = new SomeClass();
		
		methods = classe.getMethods();
		for (Method metodo: methods) {				
			Info info = metodo.getAnnotation(Info.class);
			
			if(info != null){
				try {					
					System.out.println(metodo.getName());					
					// Execute the method "metodo" of the object "obj", something like this: "obj.metodo()"
					System.out.println(metodo.invoke(obj));						
				} catch (Exception e) {
					e.printStackTrace();
				}				
			}
			
		}
		

	}
}

// Fontes: 
// http://www.caelum.com.br/apostila-java-testes-xml-design-patterns/reflection-e-annotations/#9-6-criando-sua-propria-anotacao


