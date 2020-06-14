import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalcServer {
	public static String calc(String exp) {
		StringTokenizer st = new StringTokenizer(exp, " ");
		if(st.countTokens() != 3) return "error";
		
		String res="";
		int op1 = Integer.parseInt(st.nextToken());
		String opcode = st.nextToken();
		int op2 = Integer.parseInt(st.nextToken());
		switch(opcode) {
		case "+":
			res = Integer.toString(op1+op2); break;
		case "-":
			res = Integer.toString(op1-op2); break;
		case "*":
			res = Integer.toString(op1*op2); break;
		default:
				res = "error";
		}
		return res;
	}
	
	
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
				System.out.println(inputMessage);
				String res = calc(inputMessage);
				out.write(res + "\n");
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
