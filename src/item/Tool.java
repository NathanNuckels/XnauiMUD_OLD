package item;

public class Tool extends item.Item{
	protected int maxDurability;
	protected int durability;

	public Tool(){
		durability = 50;
		maxStackSize = 1;
		name = "Tool";
		hName = "Invalid Tool";
	}
	public void setDurability(int dur){durability=dur;}
	public int getDurability(){return durability;}
	public int getMaxDurability(){return maxDurability}
}
