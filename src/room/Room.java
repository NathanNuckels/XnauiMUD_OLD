package room;

public class Room{
	public item.Container items;
	protected Room north,south,east,west;
	protected String title;
	protected String look;
	public String[] actions;

	public Room(){
		north=null;
		south=null;
		east=null;
		west=null;
		title="Invalid Room";
		look="You are in a completely white room sitting at a table. On the table is a note.";
		actions={"read note"};
	}
	public boolean runAction(String a){
		if (a=="read note"){
			logger.write("The note says:\nIf ou are in this room, file a report at https://github.com/NathanNuckels/XnauiMUD");
			return true;
		} else {
			return false;
		}
	}
	public Room getRomNorth(){return north;}
	public Room getRoomSouth(){return south;}
	public Room getRoomWest(){return west;}
	public Room getRoomEast(){return east;}
}
