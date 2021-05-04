package homework3game;

import java.rmi.RemoteException;

public class UserManager implements UserService {
	private UserCheckService   userCheckService ;

	public UserManager(homework3game.UserCheckService userCheckService) {
		
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user)  throws RemoteException{
		
		if(userCheckService.checkIfRealPerson(user)) {
		
		System.out.println(user.getFirstName() +" " + user.getLastName() + "  isimli kullanýcý kaydedildi");
		}
		else {
			System.out.println("Kullanýcý geçerli deðil");
		}
		
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() +" " + user.getLastName() + " isimli kullanýcý silindi ");
		
	}

	@Override
	public void update(User user) {
		
		System.out.println(user.getFirstName() +" " + user.getLastName() + " isimli kullanýcý updatelendi ");
		
		
	}

}
