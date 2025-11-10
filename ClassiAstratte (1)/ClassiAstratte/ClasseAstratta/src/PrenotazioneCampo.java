
import java.time.LocalDate;
import java.time.LocalDateTime;


public abstract class  PrenotazioneCampo {
    LocalDateTime dataInzio;
    String nomeGiocatore;
    LocalDateTime dataFine;

    public PrenotazioneCampo(String nome, LocalDateTime dataInizio, LocalDateTime dataFine){
       this.nomeGiocatore=nome;
       this.dataInzio =   dataInizio;
       this.dataFine = dataFine;
   }

   public abstract double CalcolaCosto();

    public abstract String tostring();
}
