package homework3game;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) throws RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getYearOfBirth());
	}

}
