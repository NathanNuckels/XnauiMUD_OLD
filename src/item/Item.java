package item;
public class Item{
	protected String name; //Class name
	protected String hName; //The name the player sees eg "Command Block"
	protected String desc; //A little lore text
	protected int maxStackSize; //Ammount of the item you can fit in one inventory slot
	protected int ammount; //Ammount of the item
	
	public Item(){
		//These varibles can be overwritten by subclasses.
		ammount = 1;
		name="Item";
		hName="Invalid Item"; //Don't let users get this!
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
	public void setAmmount(int am){ammount = am;}
}
