import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRMI extends Remote {
	public String SaveMessage(String message, String emitter) throws RemoteException;
}
