import java.util.Scanner;

public class Feu extends Pokemon {
	private String nameAttack;
	private int attackCanicule;


	public int getAttackCanicule() {
		return this.attackCanicule;	
	}


	public Feu(String name,int pv, int attack){
		super(name, pv, attack);
		this.attackCanicule = 400 ; 

		/*Scanner scc = new Scanner(System.in);
		System.out.println( "Choisissez l'attaque");
		String attackj = scc.nextLine();
		
		if ( attackj.equals("canicule")) {
		 	canicule;
*/
	
	}

	

	public void canicule(Vent v){
	
	
		v.setPv(v.getPv() - this.getAttackCanicule());
		System.out.println (this.name + " has " + this.pv + " points remaining. ");
		System.out.println (this.isKo() ? this.name + " is KO ": this.name + " is still alive");

	}

	public void canicule(Feu v){
	
	
		v.setPv(v.getPv() - (this.getAttackCanicule()/2));
		System.out.println (this.name + " has " + this.pv + " points remaining. ");
		System.out.println (this.isKo() ? this.name + " is KO ": this.name + " is still alive");

	}	
		


}







