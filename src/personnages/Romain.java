package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipements = 0;
	private String texte;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

//	public void recevoirCoup(int forceCoup) {
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//		}
//	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipements) {
		case 0: {
			ajouterEquipement(equipement);
			break;
		}
		case 1: {
			if (equipements[0] == equipement) {
				System.out.println("le soldat" + nom + "à deja un " + equipement);
			} else {
				ajouterEquipement(equipement);

			}
			break;
		}
		default: {
			System.out.println("le soldat" + nom + "est deja protege");
		}
		}
	}

	private void ajouterEquipement(Equipement equipement) {
		System.out.println("le soldat " + nom + " s'equipe avec un " + equipement);
		equipements[nbEquipements] = equipement;
		nbEquipements++;
	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		switch (force) {
		case 0:
			parler("Aïe");
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
		}
		// post condition la force à diminuer
		assert force < oldForce;
		return equipementEjecte;
	}

	private int CalculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du
		coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (!(nbEquipement == 0)) {
		texte += "\nMais heureusement, grace à mon équipement sa
		force est diminué de ";
		for (int i = 0; i < nbEquipement;) {
		if ((equipements[i] != null &&
		equipements[i].equals(Equipement.BOUCLIER)) == true) {
		resistanceEquipement += 8;
		} else {
		System.out.println("Equipement casque");
		resistanceEquipement += 5;
		}
		i++;
		}
		texte =+ resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + "
		s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				continue;
				} else {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	public static void main(String[] args) {
		Romain cesar = new Romain("cesar", 2);
		cesar.prendreParole();
		cesar.parler("je suis cesar!!");
		cesar.recevoirCoup(1);
		cesar.sEquiper(Equipement.CASQUE);
		cesar.sEquiper(Equipement.CASQUE);
		cesar.sEquiper(Equipement.BOUCLIER);
		cesar.sEquiper(Equipement.CASQUE);
	}

}
