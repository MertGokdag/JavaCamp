package homework3game;

import java.rmi.RemoteException;

public interface UserCheckService {

	boolean checkIfRealPerson (User user) throws RemoteException ;
	
}
