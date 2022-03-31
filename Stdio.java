import java.utils.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Stidio{
	private File log;
	private FileWriter logWriter;
	private boolean debug;
	public Stdio(String logpath, boolean debugBool){
		debug=debugBool;
		log = new File(logpath);
		logWriter = newFileWriter(logpath);
	}
	public void print(String line){
		System.out.println(line);
		logWriter.write(line);
	}
	public void println(String line){
		System.out.println(line);
		logWriter.write(line+"\n");
	}
	public void debug(String line){
		logWriter.write("DEBUG: "+line+"\n");
		if (debug){
			System.out.println("DEBUG: "+line);
		}
	}
}
//Thank Kyuu >w<
