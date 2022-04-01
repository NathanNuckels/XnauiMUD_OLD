//FRAMEWORK
//Item
//
//Provides a basic framework for all Items in the game
//Provides Savedata, item name, and other basic stuff

//IMPORTS

public class Item{
	final private String name; //Class name
	final private String hName; //The name the player sees eg "Command Block"
	final private String desc; //A little lore text
	final private int maxStackSize; //Ammount of the item you can fit in one inventory slot
	private int ammount; //Ammount of the item
	
	public Item(){
		//These varibles can be overwritten by subclasses.
		name="Item";
		hName="Invalid Item" //Don't let users get this!
		maxStackSize = 99;  //default stack size is 99
		desc = "Report his to the devs imeadiatly.\nhttps://github.com/NathanNuckels/XnauiMUD/";
	}

	public String getSaveData(){
		return name+"|"+Integer.toString(ammount)+"|END\n";
	}
	public String getId(){return name;}
	public String getName(){return hName;}
	public String getLore(){return desc;}
	public int getAmmount(){return ammount;}
	public int getStackSize(){return maxStackSize;}
}
