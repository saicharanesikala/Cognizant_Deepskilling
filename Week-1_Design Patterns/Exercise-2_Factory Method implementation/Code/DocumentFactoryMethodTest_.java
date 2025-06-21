

public class DocumentFactoryMethodTest_ {

	public static void main(String[] args) {
DocumentFactory factory = new DocumentFactory();
System.out.println("Testing word...");
		Document Document1 = factory.createDocument(1); //1 for word
		Document1.open();
		Document1.save();
		Document1.close();
		System.out.println("Testing Document...");
		Document Document2 = factory.createDocument(2); // 2 for pdf
		Document2.open();
		Document2.save();
		Document2.close();
		System.out.println("Testing Excel...");
		Document Document3 = factory.createDocument(3); //3 for excel
		Document3.open();
		Document3.save();
		Document3.close();
	}

}
