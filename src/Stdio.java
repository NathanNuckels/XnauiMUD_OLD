import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Stdio{
	private File log;
	private FileWriter logWriter;
	private boolean debug;

	public Stdio(String logpath, boolean debugBool){
		debug=debugBool;
		log = new File(logpath);
		try{
			logWriter = new FileWriter(logpath);
			log.createNewFile();
		} catch (IOException e) {
			System.out.println("ERROR CREATING LOG FILE");
			ExceptionHandler.handleAndCrash(e);
		}
	}
	public void print(String line){
		System.out.println(line);
		try{
			logWriter.write(line);
		} catch (IOException e){
			System.out.println("ERROR WRITING TO LOG FILE");
			ExceptionHandler.handleAndCrash(e);
		}
	}
	public void println(String line){
		System.out.println(line);
		try{
			logWriter.write(line+"\n");
		} catch (IOException e){
			System.out.println("ERROR WRITING TO LOG FILE");
			ExceptionHandler.handleAndCrash(e);
		}
	}
	public void debug(String line){
		try{
			logWriter.write("DEBUG: "+line+"\n");
		} catch (IOException e){
			System.out.println("ERROR WRITING TO LOG FILE");
			ExceptionHandler.handleAndCrash(e);
		}
		if (debug){
			System.out.println("DEBUG: "+line);
		}
	}
}
//Thank Kyuu >w<
