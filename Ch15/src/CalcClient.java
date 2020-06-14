import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.println("°è»ê½Ä(ºóÄ­À¸·Î ¶ç¿ö ÀÔ·Â, ¿¹: 24 + 42)>>");
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage);
					out.flush();
					break;
				}
				
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("Server : " + inputMessage);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close();
				if(socket != null) socket.close();
			}catch(IOException e){
				System.out.println("There was an error with Server");
			}
		}
	}

}
