import java.util.Random;

public class Builder {
	public static Monster goblin(){
		Monster goblin = new Monster();
		goblin.setName("Goblin");
		goblin.setPower(2);
		goblin.setVitality(1);
		goblin.setAgility(4);
		goblin.setInteligence(3);
		goblin.setWeakness("CUT");
		
		
		Random random = new Random();
		boolean key = true;
		while(key == true){
			for(int pts = goblin.getPower(); pts > 0; pts--){
				if (random.nextInt() % 2 == 0){
					goblin.setForce(goblin.getForce()+1);
				}else{
					goblin.setConstruct(goblin.getConstruct()+1);
				}	
			}
			for(int pts = goblin.getVitality(); pts > 0; pts--){
				if (random.nextInt(9)+1 <= 7){
					goblin.setStamina(goblin.getStamina()+1);
				}else{
					goblin.setConstruct(goblin.getConstruct()+1);
				}
			}
			for(int pts = goblin.getAgility(); pts > 0; pts--){
				if(random.nextInt(9)+1 < 6){
					goblin.setSpeed(goblin.getSpeed()+1);
				}else{
					goblin.setReflexes(goblin.getReflexes()+1);
				}
			}
			for(int pts = goblin.getInteligence(); pts > 0; pts--){
				if (random.nextInt(9)+1 <= 8) {
					goblin.setWisdom(goblin.getWisdom()+1);
				}else{
					goblin.setReflexes(goblin.getReflexes()+1);
				}
			}
		
			
			if(goblin.getForce() == 0 || goblin.getConstruct() == 0||goblin.getStamina() == 0||goblin.getSpeed() == 0||goblin.getReflexes() == 0||goblin.getWisdom()==0){
				goblin.setForce(0);
				goblin.setConstruct(0);
				goblin.setStamina(0);
				goblin.setSpeed(0);
				goblin.setReflexes(0);
				goblin.setWisdom(0);
				
			}else{
				key = false;
			}
		}
		MType smash = new MType();
		Move soco = new Move(smash, 2,"Soco");
		Move soco2 = new Move(smash, 4, "Cabeçada");
		goblin.moves.add(soco);
		goblin.moves.add(soco2);
		return goblin;
	}
}
