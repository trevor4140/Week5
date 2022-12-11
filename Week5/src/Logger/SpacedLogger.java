package Logger;

public class SpacedLogger implements Logger{

	
	public void log(String log) {
		for ( int i = 0; i < log.length(); i++) 
		{
		System.out.print(log.charAt(i)+ " ");
		}
	}

	
	public void error(String error) {
		System.out.print("\nError: ");
		for (int i = 0; i < error.length(); i++) 
		{
		System.out.print(error.charAt(i) + " ");
		}
	}

}
