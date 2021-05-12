package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui représente un médecin généraliste
 * @date 12 mai 2021
 * @version v1.0
 * @author Véronique Cheval
 */
public class MedecinGeneraliste {
    private String nom; // attribut d'instance
    private String prenom; // attribut d'instance
    private String telephone; // attribut d'instance
    private static int tarif = 25; // attribut de classe (grâce à static) (c'est un attribut que tous les médecins se partagent)

    // constructeur permet de paramétrer les attributs de mon instance. THIS permet d'acceder aux éléments
    public MedecinGeneraliste(String nom, String prenom, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    /**
     * méthode getters
     * @return nom
     */

    //methodes getters (accès en lecture = sert à lire) si je suis à l'exterieur et je vais passer par les getters
    public String getNom() {
        return nom;
    }

     public String getNumeroDeTelephone() {
        return telephone;
    }

    public static int getTarif() { // en gris donc a sup car on s'en sert pas
        return tarif;
    }


    //methodes setters (accès en écriture = sers à modifier la valeur)


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumeroDeTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static void setTarif(int tarif) {
        MedecinGeneraliste.tarif = tarif;
    }


    //methode afficher

    /**
     * Affiche sous la forme :
     * NOM Prénom
     * Téléphone : XXXXX
     * Tarif : XX€
     */

    public void afficher() {
        // PRINTF pour afficher avec la méhode %
        System.out.printf("%s %s%n Téléphone : %s%nTarif : %d€%n",
                this.nom.toUpperCase(), this.prenom, this.telephone, MedecinGeneraliste.tarif);
        // 1 autre méthode d'affichage
        System.out.println(this.nom + " " + this.prenom);
        System.out.println("telephone : " + this.telephone);
        System.out.println("Tarifs" + " " + tarif + " € ");
    }
}


