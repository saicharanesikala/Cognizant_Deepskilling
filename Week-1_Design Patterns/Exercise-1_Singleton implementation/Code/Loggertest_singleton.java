


public class Loggertest_singleton {

	public static void main(String[] args) {
		System.out.println("Testing Singleton pattern\n");
		 Logger logger1 = Logger.getInstance();
	     Logger logger2 = Logger.getInstance();
	     
	     
	     logger1.log("One");
	     logger2.log("Two");
	  
	     
	     if (logger1 == logger2) {
	            System.out.println("_only one logger instance is used.");
	        } 
	     else {
	            System.out.println("Logger instances are different.");
	        }
		

	}

}
