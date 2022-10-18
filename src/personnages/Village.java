package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
		
	public void ajouterHabitant(Gaulois habitant) {
		villageois[nbVillageois]= habitant;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void afficherVillageois(Village village) {
		System.out.println("Dans le village de"+ chef.getNom()+"il y a les villageois");
		for (int i=0 ; i < nbVillageois ; i++) {
			if (villageois[i]!= null) {
				System.out.println(villageois[i].getNom());
			}
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("village des irréductibles", 30);
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		Gaulois asterix = new Gaulois( "asterix" , 8 );
		village.setChef(abraracourcix);
		village.ajouterHabitant(asterix);
		village.trouverHabitant(0);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois(village);
	}
}
