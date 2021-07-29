import java.rmi.Naming;

public class Server {
	
	public Server() {
		
		try {
			IRMI i = new RMIimplementation();
			Naming.rebind("rmi://localhost//SaveMessage", i);
		}catch(Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Server();
	}

}
