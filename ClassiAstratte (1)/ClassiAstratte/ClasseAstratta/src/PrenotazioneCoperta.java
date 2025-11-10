import java.time.Duration;
import java.time.LocalDateTime;

public class PrenotazioneCoperta extends PrenotazioneCampo{

    public PrenotazioneCoperta( String nome, LocalDateTime dataInizio, LocalDateTime dataFine) {
        super(nome, dataInizio, dataFine );
    }

    @Override
    public double CalcolaCosto() {

        long durata = Duration.between(dataInzio, dataFine).toMinutes();

        double prezzo = 0.25;
        double prezzotot;
        prezzotot = prezzo*durata;
        return prezzotot;

    }
    @Override
    public String tostring() {
        String msg = "prenotazione nel campo interno, inizia alle " + nomeGiocatore+ dataInzio.getHour() + ":"+ dataInzio.getMinute() + " e finisce alle " + dataFine.getHour() +":" + dataFine.getMinute() + "\n";
        return msg;
    }
}
