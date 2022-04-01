import java.util.Scanner;
public class Install {
	public static void main(String[] args){
		Scanner s = ne wScanner(System.in);
		System.out.println("This is the Xnaui MUD Installer");
		System.out.println("You also need the other JAR file.");
		System.out.println("Usually, the default path is correct but if you moved or renamed it, it will be different.");
		System.out.println("Enter the filepath to the \"Xnaui-data.jar\" file");
		String filename = s.getNextLine();
		System.out.println("Checking if the file exists...");
		//Check if file exists
		//Ask for install path
		//Extract jar file to path
