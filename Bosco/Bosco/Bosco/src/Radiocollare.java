import java.time.LocalDate;

public class Radiocollare {
    LocalDate dataAtt;
    String tipolgia;

    public Radiocollare(LocalDate date, String tipo){
        this.dataAtt = date;
        this.tipolgia=tipo;
    }

    public String getDataAtt() {
        String ret;
        ret=dataAtt.toString();
        return ret;

    }

    public String getTipolgia() {
        return tipolgia;
    }
}
