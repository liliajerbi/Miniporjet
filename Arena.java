import java.util.Scanner;
public class Arena {
	
	public static void main (String [] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Entrez le type de Pokémon : ");
		 String typePok = sc.nextLine();

		if ( typePok.equals("Feu")) {
			Feu dracofeu = new Feu ("Dracofeu" , 1000 , 400 );
			Vent tortank = new Vent ("Tortank", 1000 , 50 ) ;

			/*while ( !dracofeu.isKo() && !tortank.isKo()) {
				tortank.takeHit(dracofeu.getAttack());
			
						
				}
			}*/
		}

		


	}
}
