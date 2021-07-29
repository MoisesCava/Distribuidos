import java.io.InputStreamReader;
import java.rmi.Naming;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			IRMI i = (IRMI)Naming.lookup("rmi://localhost//SaveMessage");
			String message;
			Scanner scan = new Scanner(new InputStreamReader(System.in));
			System.out.println("Hi. What's your name?");
			message = scan.nextLine();
			System.out.println(i.SaveMessage(message, "My name is Client"));
		} catch(Exception e) {
			
		}
	}

}
