public class InputParcer{
	//InputParcer(command, current room, player);
	public static process(String c, Logger logger, room.Room room, Player player){
	       String[] comand=c.split(" ");
	       if (command[0]=="help"){
		       if (command.length==1){
			       System.out.println("List of commands:");
			       System.out.println("help [command] - Explains a command");
			       //...
		       }
		       else {
			       ;
		       }
	       }
	       else if (command[0]=="n"||command[0]=="north"){
		       if (room.getRoomNorth() == null){
			       logger.write("You can't go that way...");
		       }
		       else {
			       player.setRoom(room.getRoomNorth());
		       }
	       }
	       else if (command[0]=="s"||command[0]=="south"){
		       if (room.getRoomSouth()==null){
			       logger.write("You can't go that way...");
		       }
		       else {
			       player.setRoom(room.getRoomSouth());
		       }
	       }
	       else if (command[0]=="w"||command[0]=="west"){
		       if (room.getRoomWest()==null){
			       logger.write("You can't go that way...");
		       }
		       else {
			       player.setRoom(room.getRoomWest());
		       }
	       }
	       else if (command[0]=="e"||command[0]=="east"){
		       if(room.getRoomEast()==null){
			       logger.write("You can't go that way...");
		       }
		       else {
			       player.setRoom(room.getRoomEast());
		       }
	       }
	}
}
