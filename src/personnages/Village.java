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
		villageois[0]= habitant;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void afficherVillageois(Village village) {
		System.out.println(chef)
		for (int i=0 , i < nbVillageois , i++) {
			System.out.println(villageois[i])
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("village des irréductibles", 30);
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		Gaulois asterix = new Gaulois( "asterix" , 8 );
		Chef setChef=abraracourcix;
		Gaulois ajouterHabitant=asterix;
		Gaulois gaulois = village.trouverHabitant(0);
		System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix", 25);
	}
}
