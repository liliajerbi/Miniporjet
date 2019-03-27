import java.util.Scanner;
public class Vent extends Pokemon {
	private String nameAttack;
	private int attackRapace;


	public int getAttackRapace() {
		return this.attackRapace;	
	}


	public Vent(String name,int pv, int attack){
		super(name, pv, attack);
		this.attackRapace = 400 ; 

		/*Scanner scc = new Scanner(System.in);
		System.out.println( "Choisissez l'attaque");
		String attack = scc.nextLine();
		
		if ( attack.equals("rapace")) {
			return rapace;*/
	
	}

	

	
	public void rapace(Feu f){
	
	
		f.setPv(f.getPv() - this.getAttackRapace()/2);
		System.out.println (this.name + " has " + this.pv + " points remaining. ");
		System.out.println (this.isKo() ? this.name + " is KO ": this.name + " is still alive");

	}
	
		


}
