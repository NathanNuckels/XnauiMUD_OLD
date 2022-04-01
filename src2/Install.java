import java.util.Scanner;
import java.util.Enumeration;
import java.util.jar.JarFile;
import java.util.jar.JarEntry;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;


public class Install {
	public static void handle(Exception e){
		System.out.println("A File related error has occured.");
		e.printStackTrace();
		System.out.println();
	}
	public static void handleAndKill(Exception e){
		System.out.println("Fatal error occured:");
		System.out.println("The system could not find the file spesified");
		e.printStackTrace();
		System.exit(1);
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("This is the Xnaui MUD Installer");
		System.out.println("You also need the other JAR file.");
		System.out.println("Enter the filepath to the \"Xnaui-data.jar\" file");
		String filename = s.nextLine();
		System.out.println("Checking if the file exists...");
		File dataFile = new File(filename);
		if (dataFile.exists() && dataFile.isFile()){
			;
		} else if (dataFile.exists() && !dataFile.isFile()){
			System.out.println("Error: Thats not a file!");
			System.exit(1);
		} else {
			System.out.println("Error:File does not exist!");
			System.exit(1);
		}
		System.out.println("Enter path to install to:");
		String installPath = s.nextLine();
		File install = new File(installPath);
		if (!install.isFile()){
			if (!install.exists()){
				install.mkdir();
			}
			System.out.println("Press enter to start...");
			s.nextLine();
			System.out.println("Extracting jar file...");
			try{
				JarFile jar;
				jar = new JarFile(dataFile);////
				Enumeration enumEntries = jar.entries();
				while (enumEntries.hasMoreElements()){
					JarEntry file = (JarEntry) enumEntries.nextElement();
					File f = new File(installPath +File.separator + file.getName());
					if (file.isDirectory()) {
						System.out.println("Created folder "+f.getPath());
						f.mkdir();
						continue;
					}
					InputStream is = jar.getInputStream(file);////
					FileOutputStream fos;
					fos = new FileOutputStream(f);///////////
					System.out.println("Writing file "+f.getPath());
					while (is.available() > 0){////
						fos.write(is.read());////
						System.out.println(String.valueOf(is.available())+" bytes left."); //PLEASE COMMENT THIS OUT!!!!!!!!!!
					}
					fos.close();////
					is.close();////
				}
				jar.close();////
			}
			catch (IOException e){
				e.printStackTrace();
				System.exit(0);
			}
		}
		else {
			System.out.println("Error: Thats a file.");
			System.exit(1);
		}
	}
}
//Thank Kyuu >w<
