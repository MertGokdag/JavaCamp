package homework3game;

import java.time.LocalDate;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println(order.getId() + "idli sipariþ eklendi");

	}

	@Override
	public void buy(User user, Game game, Campaign campaign) {
		System.out.println(
				user.getFirstName() + " " + user.getLastName() + " isimli kullanýcý, " + game.getName() + " oyununu "
						+ (campaign != null
								? campaign.getName() + " kampayasýndaki %" + campaign.getDiscount() + " indirim ile "
										+ game.getPrice() * (100 - campaign.getDiscount()) / 100
								: game.getPrice())
						+ " fiyatý üzerinden satýn aldý.");
		
		final Order order = campaign != null
                ? new Order(1, user.getId(), game.getId(), campaign.getId(), LocalDate.now())
                : new Order(1, user.getId(), game.getId(), LocalDate.now());
        add(order) ;
	}

}
