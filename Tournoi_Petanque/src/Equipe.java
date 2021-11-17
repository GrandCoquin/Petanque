import java.util.ArrayList;

public class Equipe {
    //attributs

    String nom;
    Integer nbpersonne = 0;
    ArrayList<Joueur> ListeJoueur = new ArrayList<Joueur>();


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNbpersonne() {
        return nbpersonne;
    }

    public void setNbpersonne(Integer nbpersonne) {
        this.nbpersonne = nbpersonne;
    }

    public void AddJoueur(Joueur j){
        if(nbpersonne==3) {
            System.out.println("Equipe complète");
        }
        else{
            ListeJoueur.add(j);
            nbpersonne++;
            Boules(ListeJoueur);
        }
    }

    public void Boules(ArrayList<Joueur> ListeJoueur)
    {
        if(nbpersonne==3) {
            for(Joueur j : ListeJoueur){
                j.nbboule =2;
            }
        }
        else{
            for(Joueur j : ListeJoueur){
                j.nbboule = 3;
            }
        }
    }

    public ArrayList<String> GetJoueur ()
    {
        ArrayList<String> j = new ArrayList<>();
        for (Joueur lej: ListeJoueur) {
            j.add(lej.getNom() + " " + lej.getPrenom());
        }
        return j;
    }


}
