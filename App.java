package week05CodingAssignment;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello");
		logger.error("goodbye");
		
		Logger logger2 = new SpacedLogger(); 
		
		logger2.log("Hello");
		logger2.error("Hello");

	}

}
