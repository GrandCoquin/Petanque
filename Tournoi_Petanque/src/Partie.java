import java.util.ArrayList;

public class Partie {
    Integer points_e1 = 0;
    Integer points_e2 = 0;
    String type_partie;
    ArrayList<Equipe> ListeEquipe = new ArrayList<Equipe>();



    public Integer getPoints_e1() {
        return points_e1;
    }

    public void setPoints_e1(Integer points_e1) {
        this.points_e1 = points_e1;
    }

    public Integer getPoints_e2() {
        return points_e2;
    }

    public void setPoints_e2(Integer points_e2) {
        this.points_e2 = points_e2;
    }

    public String getType_partie() {
        return type_partie;
    }

    public void setType_partie(String type_partie) {
        this.type_partie = type_partie;
    }

    public ArrayList<Equipe> getListeEquipe() {
        return ListeEquipe;
    }

    public void setListeEquipe(ArrayList<Equipe> listeEquipe) {
        ListeEquipe = listeEquipe;
    }

    public void Jouer(Equipe e1, Equipe e2){
        Jeu j = new Jeu();
        Integer i=0;
        Integer t=0;
        while(points_e1 < 11 && points_e2<11) {
            j.Game(e1, e2);
            while(i<j.getPoints_gagnes_e1())
            {
                if(points_e1 == 11){
                    break;
                }
                points_e1 ++;
                i++;
            }
            if(points_e1 == 11){
                break;
            }
            while(t < j.getPoints_gagnes_e2())
            {
                if(points_e2 == 11){
                    break;
                }
                points_e2 ++;
                t++;
            }
            if(points_e2 == 11){
                break;
            }

            System.out.println("L'équipe" + e1.getNom() + " a marqué " + j.getPoints_gagnes_e1() + " point");
            System.out.println("**************************************");
            System.out.println("L'équipe" + e2.getNom()  + " a marqué " + j.getPoints_gagnes_e2() + " point");
            System.out.println("**************************************");

            i =0;
            t = 0;
        }
        if (points_e1 >= 11)
        {
            System.out.println("**************************************");
            System.out.println("L'équipe " + " " + e1.getNom() + " a gagné avec " + points_e1 + " points");
            System.out.println("**************************************");
            System.out.println("L'équipe " + " " + e2.getNom() + " a perdu avec " + points_e2 + " points");

        }
        if (points_e2 >= 11)
        {
            System.out.println("**************************************");
            System.out.println("L'équipe " + " " + e2.getNom() + " a gagné avec " + points_e2 + " points");
            System.out.println("**************************************");
            System.out.println("L'équipe " + " " + e1.getNom() + " a perdu avec " + points_e1 + " points");

        }
    }
}
