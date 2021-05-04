package homework3game;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		User user =new User (1,"Mert Can", "Gökdað","11117607082", 1997) ;
		
		UserManager userManager = new UserManager(new MerniServiceAdapter());
		userManager.add(user);
		
		
	}

}
