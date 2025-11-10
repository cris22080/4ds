import java.time.LocalDate;

public class Orso extends Animale{
    Radiocollare radiocollare;

    public Orso(String nome, float peso, String sesso, String radioCollare, LocalDate date, String tipo){
        super(nome, peso, sesso);
        this.radiocollare = new Radiocollare(date, tipo);
    }

    @Override
    public String versoAnimale() {
        return "Ruglio";
    }

    @Override
    public String toString() {
        return super.toString() + " l'orso ha il radio collare: " + radioCollare;
    }
}
