package ml.schulzke.adventure;

public class Inventory {
	
	private int gold = 0;
	private int potion = 0;
	private boolean keyHouse = false;
	private Item[] items = new Item[50];
	//private Items[];
	
	public Item[] getItems() {
		return items;
	}

	public void setItems(Item item) {
		boolean set = false;
		for(int i=0;i<items.length;i++) {
			if(items[i]==null&&set==false) {
				this.items[i] = item;
				set = true;
			
			}
		}
	}

	public void setItem(int i) {
		this.items[i] = null;
	}

	public int getInventoryLength() {
		int invetory = 0;
		for(Item item : items) {
			if(item!=null) {
				invetory++;
			}
		}
		return invetory;
		
	}
	
	public int getInventoryWeight() {
		int weight = 0;
		for(Item item : items) {
			if(item!=null) {
				weight += item.getWeight();
			}
		}
		return weight;
		
	}
	
	public boolean isKeyHouse() {
		return keyHouse;
	}

	public void setKeyHouse(boolean keyHouse) {
		this.keyHouse = keyHouse;
	}

	public int getGold(){
		return this.gold;
	}
	
	public void setGold(int gold){
		this.gold = gold;
	}
	
	public int getPotion(){
		return this.potion;
	}
	
	public void setPotion(int potion){
		this.potion = potion;
	}

}
