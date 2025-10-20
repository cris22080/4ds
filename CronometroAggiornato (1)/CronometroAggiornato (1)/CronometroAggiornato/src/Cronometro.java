public class Cronometro {

    private boolean inEsecuzione;
    private int tDiPartenza;
    private int tDiPartenzaGiroCorrente;
    private int durataUltimoGiro;
    private int tTotale;
    private int giriCompletati;
    private int nGiri;
    private int sTotali;

    public Cronometro(int n) throws Exception {
        if (n > 0) {
            nGiri = n;
        } else {
            throw new Exception("Errore: I giri non possono essere negativi");
        }
        inEsecuzione = false;
        sTotali = 0;
    }


    public void partito(int s) throws Exception {
        if (!inEsecuzione) {
            inEsecuzione = true;
            tDiPartenza = s;
            tDiPartenzaGiroCorrente = tDiPartenza;
            sTotali += s;
        } else {
            throw new Exception("Errore: Sei già partito");
        }
    }

    public void marcaGiro(int s) throws JavaInputException {
        if (inEsecuzione && nGiri != giriCompletati) {
            durataUltimoGiro = s - tDiPartenzaGiroCorrente;
            giriCompletati++;
            tDiPartenzaGiroCorrente = s;
            tTotale = tDiPartenzaGiroCorrente - tDiPartenza;
            sTotali += s;
        } else {
            throw new JavaInputException();
        }
    }
    public int getDurataUltimoGiro() {
        return durataUltimoGiro;
    }


    public int getTempoTotale() {
        return tTotale;
    }


    public int getGiriRimanenti() {
        return nGiri - giriCompletati;
    }

    public int getGiriCompletati() {
        return giriCompletati;
    }
    public boolean isInEsecuzione() {
        return inEsecuzione;
    }


}
