import java.util.ArrayList;

public class Tournoi {
    String nom;
    Integer nbequipes = 0;
    ArrayList<Equipe> LesEquipes = new ArrayList<>();
    String prix;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNbequipes() {
        return nbequipes;
    }

    public void setNbequipes(Integer nbequipes) {
        this.nbequipes = nbequipes;
    }

    public ArrayList<Equipe> getLesEquipes() {
        return LesEquipes;
    }

    public void setLesEquipes(ArrayList<Equipe> lesEquipes) {
        LesEquipes = lesEquipes;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public void AddEquipe(Equipe e1){
        LesEquipes.add(e1);
        nbequipes++;
    }

}
