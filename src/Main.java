import java.util.Scanner;
import java.io.File;

public class Main{
	private Stdio stdio;

	public void start(){
		stdio = new Stdio("log",true);
		File introArt = new File("data/intro_art.txt");
		try{
			Scanner introArtReader = new Scanner(introArt);
		} catch (FileNotFoundException e) {
			stdio.println("Non fatal error:");
			stdio.println("\t'data/intro_art.txt' not found. Check your instalation.");
			StackTraceElement[] eee = e.getStackTrace();
			for (StackTraceElement eeee:eee)
		}
		stdio.debug("Started XnauiMUD.\nCurrently offline");
		while (introArtReader.hasNextLine()){
			System.out.println(introArtReader.nextLine());
		}
	}

	public static void main(String args[]){
		new Main().start();
	}
}
