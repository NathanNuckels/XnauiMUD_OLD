package character;
import java.util.ArrayList;
public class Character{
	private String type;
	private String lore;
	private ArrayList<character.Ability> abilities;
	private ArrayList<character.Property> properties;

	public Character(){
		type="Default Character";
		lore="Used for testing.";
		abilities = new ArrayList<character.Ability>();
		properties = new ArrayList<character.Property>();
	}
	public String getType(){return type;}
	public String getLore(){return lore;}
	public ArrayList<character.Property> getProperties(){return properties;}
	public ArrayList<character.Ability> getAbilities(){return abilities;}
}
