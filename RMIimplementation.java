import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.format.DateTimeFormatter;

public class RMIimplementation extends UnicastRemoteObject implements IRMI {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public RMIimplementation() throws RemoteException{
		
		super();
	}
	
	
	@Override
	public String SaveMessage(String message, String emitter) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			FileWriter file = new FileWriter("C:\\Users\\USER DELL\\eclipse-workspace\\RMI_Practica\\message.txt",true);
			BufferedWriter output = new BufferedWriter(file);
			String receivedMessage = message + " sended by "+ emitter + "\n\n" ;
			output.write(receivedMessage);
			output.close();
		} catch (IOException e) {
			
			e.printStackTrace();
			return "An error has occurred ";
		}
		return "The message been saved successfully";
	}

}
