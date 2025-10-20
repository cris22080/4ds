public class Giro {
    private int[] giriCompletati;
    private int nGiro;
    private String nome;
    private int tempo;


    public Giro(int nGiri, String nome){
        this.nGiro = nGiri;
        this.giriCompletati = new int[nGiri];
        for(int i = 0; i < nGiro; i++){
            giriCompletati[i] = 0;
        }
    }

    public void giroComple(int tempo, int giro){

        giriCompletati[giro] = tempo;
    }

    public int getGiro(int count) {

        return giriCompletati[count];
    }

    public int getnGiro() {

        return nGiro;
    }
}
