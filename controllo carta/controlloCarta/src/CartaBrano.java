public class CartaBrano {
    private int brani;
    private boolean attivata;


    public CartaBrano(int nBrani) throws Exception {
        if (nBrani > 0) {
            brani = nBrani;
        } else {
            throw new Exception("inserisci un numero di brani valido (maggiore di 0)");


        }
    }
}