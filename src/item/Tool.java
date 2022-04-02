package item;

public class Tool extends item.Item{
	protected int maxDurability;
	protected int durability;
	final protected int maxStackSize;
	final protected int ammount;

	public Tool(){
		durability = 50;
		maxStackSize = 1;
		ammount = 1;
		name = "Tool";
		hName = "Invalid Tool";
	}
	public String getSaveData(){
		return name+"|1|"+Integer.toString(durability)+"|END\n";
	}

	public void setDurability(int dur){durability=dur;}
	public int getDurability(){return durability;}
	public int getDurabilityPercent(return durability/maxDurability;}
	public int getMaxDurability(){return maxDurability}
}
