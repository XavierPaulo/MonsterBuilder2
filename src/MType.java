
public class MType {
	String name;
	int power;
	int speed;
	int spirit;
	
	public void cutMove(){
		this.name = "CUT";
		this.power = 2;
		this.speed = 3;
		this.spirit = 1;
	}
	
	public void smashMove(){
		this.name = "SMASH";
		this.power = 3;
		this.speed = 1;
		this.spirit = 2;
	}
	
	public void spiritMove(){
		this.name = "SPIRIT";
		this.power = 1;
		this.speed = 2;
		this.spirit = 3;
	}
}
