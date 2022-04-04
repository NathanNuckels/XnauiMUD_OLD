
public class Player{
	private character.Character chr;
	private room.Room room;
	private item.Inventory inv;
	private ArrayList<character.Ability> abilities;
	public Player(character.Character ch, room.Room r){
		chr = ch;
		room = r;
		inv = new item.Inventory(20);
		abilities = chr.getAbilities();
	}
}
