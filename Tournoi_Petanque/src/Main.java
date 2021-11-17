import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenue dans le tournoi de pétanque");
        System.out.println("**************************************");
        ArrayList<Equipe> LesEquipes = new ArrayList<>();
        Equipe equipe1 = new Equipe();
        equipe1.setNom("Les Bgs");
        Joueur joueurs1 = new Joueur();
        joueurs1.setNom("Jerry");
        joueurs1.setPrenom("Cul");
        Joueur joueurs2 = new Joueur();
        joueurs2.setNom("Henri");
        joueurs2.setPrenom("CulCul");
        Joueur joueurs3 = new Joueur();
        joueurs3.setNom("Paul");
        joueurs3.setPrenom("CulCulCul");
        equipe1.AddJoueur(joueurs1);
        equipe1.AddJoueur(joueurs2);
        equipe1.AddJoueur(joueurs3);


        Equipe equipe2 = new Equipe();
        equipe2.setNom("Les trous du zob");
        Joueur joueurs4 = new Joueur();
        joueurs4.setNom("Michel");
        joueurs4.setPrenom("Dutrou");
        Joueur joueurs5 = new Joueur();
        joueurs5.setNom("Michael");
        joueurs5.setPrenom("Polin");

        equipe2.AddJoueur(joueurs4);
        equipe2.AddJoueur(joueurs5);


        System.out.println("Equipe 1 : " + equipe1.getNom());
        System.out.println("Joueurs :" + equipe1.GetJoueur());
        System.out.println("**************************************");
        System.out.println("Equipe 2 : " + equipe2.getNom());
        System.out.println("Joueurs :" + equipe2.GetJoueur());

        System.out.println("Début de partie !");


        Partie partie1 = new Partie();
        partie1.Jouer(equipe1, equipe2);




    }
}
