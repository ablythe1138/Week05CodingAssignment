package week05CodingAssignment;

public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		StringBuilder sb = new StringBuilder(log);
		for (int i=1; i<sb.length(); i+=2)
			sb.insert(i,  ' ');
		System.out.println(sb.toString());
		
	}

	@Override
	public void error(String error) {
		StringBuilder sb2 = new StringBuilder(error);
		for (int i=1; i<sb2.length(); i+=2)
			sb2.insert(i,  ' ');
		System.out.println("Error: " + sb2.toString());
		
	}

}
