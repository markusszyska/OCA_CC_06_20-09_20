package ml.schulzke.creature;

public enum CreatureType {
		
		HEADY("Heady"),
		FOOTY("Footy"),
		TRUNKY("Trunky");
		
		private String name;
		  
		CreatureType(String name) {
			this.setName(name);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
}
