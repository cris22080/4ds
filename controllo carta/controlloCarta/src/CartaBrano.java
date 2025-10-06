public class CartaBrano {
    private int brani;
    private boolean attivata = false;

    CartaBrano(int n) throws Exception {
        if(n>0){
            brani = n;
        } else {
            throw new Exception("Errore numero brani carta invalido");
        }
    }

    public void attiva() throws Exception {
        if(!attivata){
            attivata = true;
        } else {
            throw new Exception("Errore la carta è già attiva");
        }
    }

    public boolean isAttivata(){return attivata;}

    public void compraBrano() throws Exception {
        if(attivata) {
            if (brani > 0) {
                brani--;
            } else {
                throw new Exception("Errore non hai abbastanza credito");
            }
        } else {
            throw new Exception("Errore carta non attiva");
        }
    }

    public int braniRimanenti() throws Exception {
        if(attivata){
            return brani;
        } else {
            throw new Exception("Errore carta non attiva");
        }
    }
}