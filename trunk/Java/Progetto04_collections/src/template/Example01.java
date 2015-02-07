package template;

public class Example01 {
	
	public static void main(String[] args) {
		
		TemplateClass<String> template01 = new TemplateClass<String>("Hello", 1);
		TemplateClass<Integer> template02 = new TemplateClass<Integer>(543, 1);		
	}
// La classe template può essere usata con diversi tipi al posto del generic
}
