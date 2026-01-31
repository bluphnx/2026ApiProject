package javaBasics;

public class JavaMethodExamples {

	public static void name(String inputString) {
		
		System.out.println("Hi,"+inputString+"!");
		
	}
	
	public void notAStaticMethod() {
		System.out.println("I am not a static method");
	}
	
	public static void main(String[] args) {
		
		name("John");
		JavaMethodExamples.name("Is it possible");
		
		JavaMethodExamples obj = new JavaMethodExamples();
		
		obj.notAStaticMethod();
		
		

	}

}
