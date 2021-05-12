package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Classe patient
 */
public class Patient {
    private String nom; // attribut d'instance
    private String prenom; // attribut d'instance
    private String telephone; // attribut d'instance
    private char sexe; // attribut d'instance
    private long numeroSs; // attribut d'instance
    private LocalDate dateDeNaissance; // attribut d'instance
    private String commentaires; // attribut d'instance


    //constructeur permet de paramétrer les attributs de mon instance.
    public Patient(String nom, String prenom, String telephone, char sexe, long numeroSs, LocalDate dateDeNaissance, String commentaires) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.sexe = sexe;
        this.numeroSs = numeroSs;
        this.dateDeNaissance = dateDeNaissance;
        this.commentaires = commentaires;


    }
    /**
     * Affiche sous la forme :
     * NOM Prénom
     * Téléphone : XXXXX
     * Sexe : Féminin ou Masculin
     * N° SS
     * Date de naissance
     */

    //methode d'instance afficher ()

    public void afficher() {


        System.out.printf("%s %s%nTéléphone : %s%n" +
                "Sexe : %s%n" +
                "Numero de sécurité sociale : %s%n" +
                "Date de naissance : %s%n " +
                "Commentaires : %s%n",this.nom.toUpperCase(), this.prenom, this.telephone,
                this.sexe == 'F' ? "Féminin" : "Masculin",
                this.numeroSs,
                // pour formater une date
                this.dateDeNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
                // ceci est un TERNAIRS que l'on peut mettre ici  // c'est comme 1 if
                this.commentaires == null ? "[Aucun commentaires]" : this.commentaires
        );

    }
        /*
        // autre méthode d'affichage
        System.out.println(this.nom + " " + this.prenom);
        System.out.println("telephone : " + this.telephone);
        System.out.println("Sexe : " + this.sexe);
        System.out.println("Numéro de Sécurité sociale : " + this.numeroSs );
        System.out.println("Date de naissance :" + this.dateDeNaissance);
        System.out.println("Commentaires : " + this.commentaires);

         */





}
