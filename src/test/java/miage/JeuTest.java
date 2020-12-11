package miage;

import org.junit.Test;

import static org.junit.Assert.*;

public class JeuTest {

    //test que le calcul du nombre de quillets tombéss est valide
    @Test
    public void testCalculNombreQuillesTombees() throws Exception {
        //given : un jeu avec les deux valeurs correspontant aux quilles tombées à chaque lancer
        Jeu unJeu = new Jeu(3,5);
        //expected : les nombres de quilles tombees durant ce jeu est 8
        assertEquals(8, unJeu.getNombreQuillesTombees());

        //given : un jeu avec 0 quilles tombées au lancer 2
        unJeu = new Jeu(6,0);
        //expected : les nombres de quilles tombees est 6
        assertEquals(6, unJeu.getNombreQuillesTombees());
    }

    @Test
    public void testIsSpareValide() throws Exception {

        //given : un jeu avec des valeurs correpontant à un spare
        Jeu unJeu = new Jeu(3,7);
        //expected : isSpare return true
        assertTrue(unJeu.isSpare());

        //given : un jeu avec des valeurs correpontant à un spare
        unJeu = new Jeu(5,5);
        //expected : isSpare return true
        assertTrue(unJeu.isSpare());

        //given : un jeu avec des valeurs correpontant à un spare
        unJeu = new Jeu(3,5);
        //expected : isSpare return true
        assertFalse(unJeu.isSpare());

        //giver : un jeu strike valide
        unJeu = new Jeu();
        //expected: isSpare retourne false
        assertFalse(unJeu.isSpare());
    }

    @Test(expected = Exception.class)
    @SuppressWarnings("unused")
    public void testJeuStrikeInvalide() throws Exception {
        //given : un jeu avec des valeurs ressemblant à un strike mais qui n'est pas valide
        Jeu unJeu = new Jeu(10,0);
        //expected : une exception
    }

    @Test(expected = Exception.class)
    @SuppressWarnings("unused")
    public void testNbQuillesTotalInvalideProvoqueErreurCreation() throws Exception {
        //giver : une tentative de creer un jeu invalide
        Jeu unJeu = new Jeu(12, 3);
        //expected : une exception
    }

    @Test(expected = Exception.class)
    @SuppressWarnings("unused")
    public void testNbQuillesLancer1InvalideProvoqueErreurCreation() throws Exception {
        //giver : une tentative de creer un jeu invalide
        Jeu unJeu = new Jeu(-1, 2);
        //expected : une exception
    }

    @Test(expected = Exception.class)
    @SuppressWarnings("unused")
    public void testNbQuillesLancer2InvalideProvoqueErreurCreation() throws Exception {
        //giver : une tentative de creer un jeu invalide
        Jeu unJeu = new Jeu(12, -2);
        //expected : une exception
    }

    @Test(expected = Exception.class)
    @SuppressWarnings("unused")
    public void testNbQuillesLancerStrikeInvalideProvoqueErreurCreation() throws Exception {
        //giver : une tentative de creer un jeu invalide
        Jeu unJeu = new Jeu(10, 0);
        //expected : une exception
    }

    @Test(expected = Exception.class)
    @SuppressWarnings("unused")
    public void testNbQuillesLancerStrike() throws Exception {
        //giver : une tentative de creer un jeu strike invalide
        Jeu unJeu = new Jeu(10, 0);
        //expected : une exception
    }

    @Test
    public void testIsStrikeValide() throws Exception {
        //giver : un jeu strike valide
        Jeu unJeu = new Jeu();
        //expected: isStrike retourne true
        assertTrue(unJeu.isStrike());

        //giver : un jeu non strike
        unJeu = new Jeu(5,5);
        //expected : isStrike retourne false
        assertFalse(unJeu.isStrike());
    }
}