package Basic_Programs;

import java.io.IOException;

public class Shutdown_Laptop {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("shutdown /s /t 0");
			//above /s means shutdown and /t mean time and 0 means Immediately if we give any number that will be consider as seconds 
			//to restart the computer enter the command like /r and also we can specify the time
			//to log of from the computer then enter the command like /l and also we can specify the time
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
