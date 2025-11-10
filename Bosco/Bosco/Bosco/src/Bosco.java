import java.util.Objects;

public class Bosco {
    private String nome;
    private String localita;
    private float estensione;
    private Animale[] animale;
    private int numeroAnimali;

    public Bosco(String nome, String localita, float estensione, int capacitaBosco){
        this.nome = nome;
        this.localita = localita;
        this.estensione = estensione;
        this.animale = new Animale[capacitaBosco];
        this.numeroAnimali = 0;
    }

    public void aggiungiAnimale(Animale an) throws ExceptionMaxAnimali{ //aggiungi animale + controllo se bosco è pieno
        if(numeroAnimali < animale.length){
            animale[numeroAnimali] = an;
            numeroAnimali++;
        }else{
            throw new ExceptionMaxAnimali();
        }
    }

    public void rimuoviAnimale() throws ExceptionNRimosso{ //rimuvo animale + controllo se numero animali è maggiore di 0
        if(numeroAnimali >= 1){
            animale[numeroAnimali] = null;
        }else{
            throw new ExceptionNRimosso();
        }
    }

    public String stampaOrsi(){ //stampa solo orsi
        String str = " ";
        for(int i = 0; i < numeroAnimali; i++){
            if(Objects.equals(animale[i].versoAnimale(), "Ruglio")){
                str += " \n " + animale[i].toString() + " \n ";
            }
        }
        return str;
    }

    public String stampaLupi(){ //stampa solo lupi
        String str = " ";
        for(int i = 0; i < numeroAnimali; i++){
            if(Objects.equals(animale[i].versoAnimale(), "Ululato")){
                str += " \n " +animale[i].toString() + " \n ";
            }
        }
        return str;
    }

    public String stampaTuttiAnimali(){ //stampa tutti gli animali
        String str = " ";
        for(int i = 0; i < numeroAnimali; i++){
            str += " \n " +animale[i].toString() + " \n ";
        }
        return str;
    }


}
