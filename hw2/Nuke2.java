import java.io.*;


public class Nuke2 {
	public static void main(String[] arg) throws Exception {
		BufferedReader keyboard;
		String inputLine;
		keyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please enter the name of a company (without spaces): ");
		System.out.flush();        /* Make sure the line is printed immediately. */
		inputLine = keyboard.readLine();
		String outputLine = String.valueOf(inputLine.charAt(0));
		for(int i=2;i<inputLine.length();i++){
			outputLine+=String.valueOf(inputLine.charAt(i));
		}
		System.out.println(outputLine);
	}
}
