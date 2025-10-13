import java.util.Timer;
import java.util.TimerTask;

public class CronometroGiri {
    private boolean inEsecuzione;
    private long tempoDiPartenza;
    private long tempoDiPartenzaGiroCorrente;
    private long durataUltimoGiro;
    private long tempoTotale;
    private int giriCompletati;
    private int numeroGiri;
    private Timer timer;

    public CronometroGiri(int numeroGiri) {
        this.numeroGiri = numeroGiri;
        reset(); // inizializza tutto
    }

    public void partito() {
        inEsecuzione = true;
        tempoDiPartenza = System.currentTimeMillis();
        tempoDiPartenzaGiroCorrente = tempoDiPartenza;
        giriCompletati = 0;
        tempoTotale = 0;

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if (inEsecuzione) {
                    tempoTotale = System.currentTimeMillis() - tempoDiPartenza;
                }
            }
        }, 0, 1000);
    }

    public void marcaGiro()throws IllegalStateException {
        if (!inEsecuzione) {
            throw new IllegalStateException("Il cronometro non è in esecuzione.");
        }

        if (giriCompletati >= numeroGiri) {
            throw new IllegalStateException("Tutti i giri sono già stati completati.");
        }

        long tempoCorrente = System.currentTimeMillis();
        durataUltimoGiro = tempoCorrente - tempoDiPartenzaGiroCorrente;
        tempoTotale += durataUltimoGiro;
        tempoDiPartenzaGiroCorrente = tempoCorrente;
        giriCompletati++;
    }

    public long getDurataUltimoGiro() {
        return durataUltimoGiro / 1000;
    }

    public long getTempoTotale() {
        return tempoTotale / 1000;
    }

    public int getGiriRimanenti() {
        return numeroGiri - giriCompletati;
    }

    public void fermato() {
        inEsecuzione = false;
        if (timer != null) {
            timer.cancel();
        }
    }

    public void reset() {
        fermato();
        this.tempoDiPartenza = 0;
        this.tempoDiPartenzaGiroCorrente = 0;
        this.durataUltimoGiro = 0;
        this.tempoTotale = 0;
        this.giriCompletati = 0;
        this.inEsecuzione = false;
    }
}
