public class Gara {
    private Giro g;
    private Cronometro crono;
    private Pilota p;


    public Gara(Pilota p, int nGiri) throws Exception { //Collego le classi
        this.p = p; //collego la classe pilota in maniera lasca
        this.crono = new Cronometro(nGiri); //collego le classi in maniera stretta
        this.g = new Giro(nGiri, p.getNome());

    }

    public void assegnaPilota(Pilota p){ //serve per cambiare il nome del pilota da gara

        this.p = p;
    }

    public Pilota getPilota(){ //serve per avere il nome del pilota da gara

        return p;
    }

    public void avvia(int secondi) throws Exception { //avvio la gara
        crono.partito(secondi);
    }

    public void marcaGiro(int secondi, int giro){ //registro il giro
        crono.marcaGiro(secondi);
        g.giroComple(secondi, giro);
    }
    public boolean conclusa(){ //controllo se è conclusa la gara
        boolean bool = false;
        if(crono.getGiriRimanenti() == 0){
            bool = true;
        }
        return bool;
    }

    public int getGiriCompletati(int count) { // stampare tempi giro

        return g.getGiro(count);
    }

    public int getGiriRimanenti(){

        return crono.getGiriRimanenti();
    }
    public int getTempoTotale(){

        return crono.getTempoTotale();
    }
    public int numeroGiro(){
        return crono.getGiriCompletati(); }
    public int getNTotGiri(){
        return g.getnGiro(); }
    public boolean getInEsecuzione(){
        return crono.isInEsecuzione();}
}
