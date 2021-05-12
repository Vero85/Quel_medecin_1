/**
 *  Classe qui représente l'adresse
 *  @date 12 mai 2021
 *  @version v1.0
 *  @author Véronique Cheval
 */



package fr.eni.ecole.quelMedecin.bo;

/**
 * Attributs d'instance de la classe Adresse
 */
public class Adresse {
    private String mentionsCompl;
    private int numero;
    private String complNumero;
    private String rue;
    private int cp;
    private String ville;

    /**
     *
     * @param mentionsCompl de type String
     * @param numero de type int
     * @param complNumero de type String
     * @param rue de type String
     * @param cp de type int
     * @param ville de type String
     */

    public Adresse(String mentionsCompl, int numero, String complNumero, String rue, int cp, String ville) {
        this.mentionsCompl = mentionsCompl;
        this.numero = numero;
        this.complNumero = complNumero;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }

    public Adresse(int numero, String complNumero, String rue, int cp, String ville) {
        this.numero = numero;
        this.complNumero = complNumero;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
    }

    /**
     * ici une méthode afficher ()
     *    Affiche sous la forme :
     *      adresse
     */
    public void afficher (){
        if (this.mentionsCompl != null){
            System.out.println(this.mentionsCompl);
        }
        System.out.printf("%d %s %s %n " +
                "%05d %s %n",
                this.numero,
                this.complNumero,
                this.rue,
                this.cp, this.ville.toUpperCase()
        );
    }
}
