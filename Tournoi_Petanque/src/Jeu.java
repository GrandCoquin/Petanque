public class Jeu {
    Integer points_gagnes_e1;
    Integer points_e1_tt;
    Integer points_gagnes_e2;
    Integer points_e2_tt;
    Boolean start_e1 = false;

    public Integer getPoints_e1_tt() {
        return points_e1_tt;
    }

    public void setPoints_e1_tt(Integer points_e1_tt) {
        this.points_e1_tt = points_e1_tt;
    }

    public Integer getPoints_e2_tt() {
        return points_e2_tt;
    }

    public void setPoints_e2_tt(Integer points_e2_tt) {
        this.points_e2_tt = points_e2_tt;
    }

    Boolean start_e2 = false;

    public Integer getPoints_gagnes_e1() {
        return points_gagnes_e1;
    }

    public void setPoints_gagnes_e1(Integer points_gagnes_e1) {
        this.points_gagnes_e1 = points_gagnes_e1;
    }

    public Integer getPoints_gagnes_e2() {
        return points_gagnes_e2;
    }

    public void setPoints_gagnes_e2(Integer points_gagnes_e2) {
        this.points_gagnes_e2 = points_gagnes_e2;
    }

    public Boolean getStart_e1() {
        return start_e1;
    }

    public void setStart_e1(Boolean start_e1) {
        this.start_e1 = start_e1;
    }

    public Boolean getStart_e2() {
        return start_e2;
    }

    public void setStart_e2(Boolean start_e2) {
        this.start_e2 = start_e2;
    }

    public void RandomPoint(){
        ResetPoints();
        if (start_e1 = true){
            points_gagnes_e1 = (int)(Math.random() * 6) ;
            if (points_gagnes_e1 > 0) {
                points_gagnes_e2 = 0;
            }
            else{
                points_gagnes_e2 = (int)(Math.random() * 6) ;
            }
        }
        if (start_e2 = true){
            points_gagnes_e2 = (int)(Math.random() * 6);
            if (points_gagnes_e2 > 0) {
                points_gagnes_e1 = 0;
            }
            else{
                points_gagnes_e1 = (int)(Math.random() * 6) ;
            }
        }

    }

    public void ResetPoints(){
        setPoints_gagnes_e1(0);
        setPoints_gagnes_e2(0);
    }

    public void Equipe1_start(){
        setStart_e1(true);
        setStart_e2(false);
    }
    public void Equipe2_start(){
        setStart_e2(true);
        setStart_e1(false);
    }
    public void RandomStart(){
        if((int)(Math.random()*(2-1)) == 1)
        {
            setStart_e1(true);
            setStart_e2(false);
        }
        else{
            setStart_e2(true);
            setStart_e1(false);
        }
    }

    public void Game(Equipe e1, Equipe e2){
        if(start_e1 == false && start_e2 == false)
        {
            RandomStart();
            RandomPoint();
        }
        else if(start_e1 == true)
        {
            RandomPoint();
        }
        else if(start_e2 == true)
        {
            RandomPoint();
        }

    }
}
