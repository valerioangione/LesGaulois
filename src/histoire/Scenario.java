package histoire;

import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix",8);
		Romain minus= new Romain("minus",6);
		asterix.parler("wesh la mifa");
		romain.parler("aie un gaugau");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		asterix.frapper(romain);
		asterix.toString();
		asterix.boirePotion(6);
	}

}
