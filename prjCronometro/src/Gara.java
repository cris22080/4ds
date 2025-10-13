import java.util.Timer;
import java.util.TimerTask;

public class Gara  {
    private long tempoDiPartenza;
    private long tempoDiPartenzaGiroCorrente;
    private long durataUltimoGiro;
    private long tempoTotale;
    private int giriCompletati;
    private int numeroGiri;
    private Timer timer;


    public Gara(int numeroGiri) {
        CronometroGiri giro = new CronometroGiri(numeroGiri);
        giro.partito();


    }

    public void gara() {

    }



    }
}

