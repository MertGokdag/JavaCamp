package homework3game;

import java.time.LocalDate;

public class Order {

	int Id;
	int customerId;
	int gameId;
	int campaignId;
	LocalDate date;

	

	public Order(int Id, int customerId, int gameId,  LocalDate date) {
		
		this.Id = Id;
		this.customerId = customerId;
		this.gameId = gameId;
		
		this.date = date;
	}
	
	public Order(int Id, int customerId, int gameId, int campaignId, LocalDate date) {
		
		this(Id, customerId,gameId,date);
		
		this.campaignId = campaignId;
			}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
