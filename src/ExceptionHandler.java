import java.io.IOException;
public class ExceptionHandler{
	public static void handleAndCrash(Exception e){
		System.out.println("----------------------------------------");
		System.out.println("        An error has occured.");
		e.printStackTrace();
		System.exit(1);
	}
	public static void handleIO(IOException e){
		System.out.println("There was an error reading or writing a File.");
		e.printStackTrace();
	}
}
