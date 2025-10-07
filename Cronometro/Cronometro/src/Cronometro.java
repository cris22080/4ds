import java.util.Timer;
import java.util.TimerTask;

public class Cronometro {
    private boolean inEsecuzione;// booleano che indica se il cronometro è in esecuzione;
    private Orario tempoDiPartenza; // Il momento in cui il cronometro è stato fatto partire;
    private int[] tempoDiPartenzaGiroCorrente; // il valore del cronometro all'inizio del giro corrente;
    private int durataUltimoGiro; // il tempo impiegato per effettuare l'ultimo giro; con ultimo si intende rispetto al giro corrente;
    private int tempoTotale; // il tempo totale trascorso dall'inizio della gara fino all'ultimo diro completo;
    private int giriCompletati;
    private int numeroGiri; // il numero totale di giri previsti per questa gara

    Timer time;

    public Cronometro (int ngiri){
        inEsecuzione = false;
        tempoDiPartenzaGiroCorrente = new int[ngiri];
        durataUltimoGiro = 0;
        tempoTotale = 0;
        giriCompletati=0;
        numeroGiri = ngiri;

        time = new Timer();

    }



    public void partito(int ora, int minuti, int secondi){
        inEsecuzione = true;
        tempoDiPartenza = new Orario(ora,minuti,secondi);

    }

    public void marcaGiro(){
        giriCompletati++;
    }

    public float getDurataUltimoGiro(){
        return durataUltimoGiro;
    }
    public float getTempoTotale(){
        return tempoTotale;
    }
    public void getGiriRimanenti(){    }
}
