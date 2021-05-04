package homework3game;

import java.rmi.RemoteException;

public interface UserService {

	void add(User user) throws RemoteException;
	
	void delete (User user) ;
	
	void update(User user) ;
	
}
