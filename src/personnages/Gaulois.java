package personnages;

public class Gaulois {
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	private String nom;
	private int force;
	private int effetPotion = 1;
	private int force,
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];

	public int getForce() {
		return force;
	}

	public String getNom() {
		return nom;
	}

	private void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}

//	private String prendreParole() {
//		return "Le gaulois" + nom + ":";
//	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3) * effetPotion);
//	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}

	public void boirePotion(int effetPotion) {
		this.effetPotion = effetPotion;
		System.out.println(" Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée");
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		System.out.println(asterix);
		Romain romain = new Romain("romain", -1);
		asterix.prendreParole();
		asterix.parler("wesh la mifa");
		romain.parler("aie un gaugau");
		asterix.frapper(romain);
		asterix.toString();
		asterix.boirePotion(6);
	}

}
