import java.time.LocalDate;

public class Orso extends Animale{
    Radiocollare radiocollare;
    LocalDate date;

    public Orso(String nome, float peso, String sesso){
        super(nome, peso, sesso);
        this.radiocollare = null;
    }

    public void addRadioCollare(String tipo, LocalDate date) throws ExeptionRadiogiaPresente{
        radiocollare = new Radiocollare(date, tipo);


    }



    @Override
    public String versoAnimale() {
        return "Ruglio";
    }

    @Override
    public String toString() {
        return super.toString() + " l'orso ha il radio collare: " + radiocollare.getTipolgia()+ "attivo da:"+ radiocollare.getDataAtt();
    }
}
