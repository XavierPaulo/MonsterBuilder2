import java.util.ArrayList;

public class Move extends ArrayList{
	int id;
	String name;
	MType type;
	int pts;
	int power;
	int speed;
	int spirit;
	
	
	//meth
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MType getType() {
		return type;
	}
	public void setType(MType type) {
		this.type = type;
	}
	public int getPts() {
		return pts;
	}
	public void setPts(int pts) {
		this.pts = pts;
	}
	
	public Move(MType type,int pts,String name){
		
		this.pts = pts;
		this.power = type.power*pts;
		this.speed = type.speed*pts;
		this.spirit = type.spirit*pts;
		this.name = name;
	}

	
}
