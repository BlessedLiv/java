import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("Waiting for the connection");
			socket = listener.accept();
			System.out.println("Connected");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Client ended the connection with bye ");
					break;
				}
				System.out.println("Client : " + inputMessage);
				System.out.println("Send>> ");
				String outputMessage = scanner.nextLine();
				out.write(outputMessage + "\n");
				out.flush();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			} catch (Exception e2) {
				System.out.println("Client chatting error");
			}
		}
		
	}

}
