
public class Main {
	public static void main(String[] args) {
		Monster goblin;
		Monster goblin2;
		
		Builder build = new Builder();
		goblin = build.goblin();
		goblin2 = build.goblin();
		//goblin 1
		System.out.println("Othron é um  " + goblin.getName());
		System.out.println("Ataques: " + goblin.getMoves());
			
		System.out.println("força: " + goblin.getForce());
		System.out.println("constituição: " + goblin.getConstruct());
		System.out.println("estamina: " + goblin.getStamina());
		System.out.println("velocidade: " + goblin.getSpeed());
		System.out.println("reflexo: " + goblin.getReflexes());
		System.out.println("sabedoria: " + goblin.getWisdom());
		System.out.println();
		System.out.println("DNA");
		System.out.println("poder" + goblin.getPower());
		System.out.println("vitalidade:" + goblin.getVitality());
		System.out.println("agilidade:" + goblin.getAgility());
		System.out.println("inteligencia:" + goblin.getInteligence());
		System.out.println("\n");
		//goblin 2
		System.out.println("Korgaha é um  " + goblin2.getName());
		System.out.println("Ataque principal: " + goblin2.getMoves().name);
		System.out.println("força: " + goblin2.getForce());
		System.out.println("constituição: " + goblin2.getConstruct());
		System.out.println("estamina: " + goblin2.getStamina());
		System.out.println("velocidade: " + goblin2.getSpeed());
		System.out.println("reflexo: " + goblin2.getReflexes());
		System.out.println("sabedoria: " + goblin2.getWisdom());
		System.out.println();
		System.out.println("DNA");
		System.out.println("poder" + goblin2.getPower());
		System.out.println("vitalidade:" + goblin2.getVitality());
		System.out.println("agilidade:" + goblin2.getAgility());
		System.out.println("inteligencia:" + goblin2.getInteligence());
	}

}
