package ml.schulzke.adventure;

public class Controls {
	
	private boolean journey = true;
	private boolean journeyCon = false;
	private boolean fight = false;
	private boolean rest = true;
	private boolean trade = false;
	private boolean potion = false;
	private boolean flee = false;
	private boolean showInventory = true;
	private boolean house = false;
	private boolean stats = true;
	
	//state
	private boolean next = false;
	private boolean nextTrade = false;
	private City currentCity = null;
	private boolean travelAbbort = false;
	
	public City getCurrentCity() {
		return currentCity;
	}
	public void setCurrentCity(City currentCity) {
		this.currentCity = currentCity;
	}
	public boolean isNextTrade() {
		return nextTrade;
	}
	public void setNextTrade(boolean nextTrade) {
		this.nextTrade = nextTrade;
	}

	private boolean foundMonster = false;
	private int locationType = 0;
	
	public int getStartFight() {
		return startFight;
	}
	public void setStartFight(int startFight) {
		this.startFight = startFight;
	}

	private int startFight = 0;
	
	public boolean isJourney() {
		return journey;
	}
	public void setJourney(boolean journey) {
		this.journey = journey;
	}
	public boolean isHouse() {
		return house;
	}
	public void setHouse(boolean house) {
		this.house = house;
	}
	public boolean isJourneyCon() {
		return journeyCon;
	}
	public void setJourneyCon(boolean journeyCon) {
		this.journeyCon = journeyCon;
	}
	public boolean isFight() {
		return fight;
	}
	public void setFight(boolean fight) {
		this.fight = fight;
	}
	public boolean isRest() {
		return rest;
	}
	public void setRest(boolean rest) {
		this.rest = rest;
	}
	public boolean isTrade() {
		return trade;
	}
	public void setTrade(boolean trade) {
		this.trade = trade;
	}
	public boolean isPotion() {
		return potion;
	}
	public void setPotion(boolean potion) {
		this.potion = potion;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public boolean isFlee() {
		return flee;
	}
	public void setFlee(boolean flee) {
		this.flee = flee;
	}
	public boolean isShowInventory() {
		return showInventory;
	}
	public void setShowInventory(boolean showInventory) {
		this.showInventory = showInventory;
	}
	public boolean isFoundMonster() {
		return foundMonster;
	}
	public void setFoundMonster(boolean foundMonster) {
		this.foundMonster = foundMonster;
	}
	public int getLocationType() {
		return locationType;
	}
	public void setLocationType(int locationType) {
		this.locationType = locationType;
	}
	
	public void changeControls(int state) {
		
		//set all to false commands
		if(state==0) {
		this.setJourney(false);				//show start journey
		this.setJourneyCon(false);			//show continue journey
		this.setFight(false);				//show fight 1turn
		this.setRest(false);				//show rest 1h
		this.setTrade(false);				//show start trade
		this.setPotion(false);				//show use healing potion
		this.setFlee(false);				//show try to flee
		this.setShowInventory(false);		//show inventory
		this.setHouse(false);				//show goTo House
		this.setStats(false);				//show goTo House
		}
		//fight option with potion
		if(state==1) {
			this.setJourney(false);				//show start journey
			this.setJourneyCon(false);			//show continue journey
			this.setFight(true);				//show fight 1turn
			this.setRest(false);				//show rest 1h
			this.setTrade(false);				//show start trade
			this.setPotion(true);				//show use healing potion
			this.setFlee(true);					//show try to flee
			this.setShowInventory(true);		//show inventory
			this.setHouse(false);				//show goTo House
			this.setStats(true);
		}
		//fight option without potion
		if(state==2) {
			this.setJourney(false);				//show start journey
			this.setJourneyCon(false);			//show continue journey
			this.setFight(true);				//show fight 1turn
			this.setRest(false);				//show rest 1h
			this.setTrade(false);				//show start trade
			this.setPotion(false);				//show use healing potion
			this.setFlee(true);					//show try to flee
			this.setShowInventory(true);		//show inventory
			this.setHouse(false);				//show goTo House
			this.setStats(true);
		}
		//start journey
		if(state==3) {
			this.setJourney(true);				//show start journey
			this.setJourneyCon(false);			//show continue journey
			this.setFight(false);				//show fight 1turn
			this.setRest(true);					//show rest 1h
			this.setTrade(false);				//show start trade
			this.setPotion(false);				//show use healing potion
			this.setFlee(false);				//show try to flee
			this.setShowInventory(true);		//show inventory
			this.setHouse(false);				//show goTo House
			this.setStats(true);
		}
		//continue journey
		if(state==4) {
			this.setJourney(false);				//show start journey
			this.setJourneyCon(true);			//show continue journey
			this.setFight(false);				//show fight 1turn
			this.setRest(true);					//show rest 1h
			this.setTrade(false);				//show start trade
			this.setPotion(false);				//show use healing potion
			this.setFlee(false);				//show try to flee
			this.setShowInventory(true);		//show inventory
			this.setHouse(false);				//show goTo House
			this.setStats(true);
		}
		//options in city
		if(state==5) {
			this.setJourney(true);				//show start journey
			this.setJourneyCon(false);			//show continue journey
			this.setFight(false);				//show fight 1turn
			this.setRest(true);					//show rest 1h
			this.setTrade(true);				//show start trade
			this.setPotion(false);				//show use healing potion
			this.setFlee(false);				//show try to flee
			this.setShowInventory(true);		//show inventory
			this.setHouse(true);				//show goTo House
			this.setStats(true);
		}
	}
	
	public String print() {
		String out = "";
		if(this.isJourney()==true) {
			out +="1 - reisen\n";
		}
		if(this.isFight()==true) {
			out +="2 - kaempfen\n";
		}
		if(this.isRest()==true) {
			out +="3 - warten\n";
		}
		if(this.isTrade()==true) {
			out +="4 - Waren handeln\n";
		}
		if(this.isPotion()==true) {
			out +="5 - Trank nutzen\n";
		}
		if(this.isFlee()==true) {
			out +="6 - Run Forest run!\n";
		}
		if(this.isShowInventory()==true) {
			out +="7 - Inventar anzeigen\n";
		}
		if(this.isJourneyCon()==true) {
			out +="8 - Reise fortsetzen\n";
		}
		if(this.isHouse()==true) {
			out +="9 - zum Haus begeben\n";
		}
		if(this.isStats()==true) {
			out +="10 - Stats ansehen\n";
		}
		return out;
	}
	public boolean isStats() {
		return stats;
	}
	public void setStats(boolean stats) {
		this.stats = stats;
	}
	public boolean isTravelAbbort() {
		return travelAbbort;
	}
	public void setTravelAbbort(boolean travelAbbort) {
		this.travelAbbort = travelAbbort;
	}
	
}
