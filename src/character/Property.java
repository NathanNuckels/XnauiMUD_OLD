package character;

public class Property{
	private String id;
	private String name;
	private String desc;

	public Property(){
		id="Property";
		name="Invalid Property";
		dec="Has no effect on the character";
	}
	public String getId(){return id;}
	public String getName(){return name;}
	public String getDesc(){return desc;}
}
