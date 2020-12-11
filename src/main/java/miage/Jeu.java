package miage;

public class Jeu {

    private int nbQuillesTombeesLancer1;
    private int nbQuillesTombeesLancer2;

    public Jeu(int nbQuillesTombeesLancer1, int nbQuillesTombeesLancer2) throws Exception {
        int nbQTotal = nbQuillesTombeesLancer1 + nbQuillesTombeesLancer2;
        if ( nbQTotal > 10 || nbQTotal < 0 ||
                nbQuillesTombeesLancer1 > 10 || nbQuillesTombeesLancer1 < 0 ||
                nbQuillesTombeesLancer2 > 10 || nbQuillesTombeesLancer2 < 0
                || (nbQuillesTombeesLancer1 == 10 && nbQuillesTombeesLancer2 == 0)
        ) {
            throw new Exception("Le jeu entré est invalide");
        }
        this.nbQuillesTombeesLancer1 = nbQuillesTombeesLancer1;
        this.nbQuillesTombeesLancer2 = nbQuillesTombeesLancer2;
    }


    public Jeu(){
        this.nbQuillesTombeesLancer1 = 10;
    }

    public int getNombreQuillesTombees() {
        if(nbQuillesTombeesLancer1 == 10) return nbQuillesTombeesLancer1;
        return this.nbQuillesTombeesLancer1 + this.nbQuillesTombeesLancer2;
    }

    private boolean getJeuStatus(){
        return this.getNombreQuillesTombees() == 10;
    }

    public boolean isSpare() {
        if(nbQuillesTombeesLancer1 == 10) return false;
        return getJeuStatus();
    }

    public boolean isStrike() {
        if(nbQuillesTombeesLancer1 != 10) return false;
        return getJeuStatus();
    }
}
