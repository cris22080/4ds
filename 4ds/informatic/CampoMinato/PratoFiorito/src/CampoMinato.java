import java.util.Random;

public class CampoMinato {
    private boolean[][] campo;
    private boolean[][] mosse;
    private int maxBomb;
    private float livello;

    CampoMinato(int r, int c, float livello, int MBomb){
        campo = new boolean[r][c];
        mosse = new boolean[r][c];
        maxBomb = MBomb;
        this.livello = livello;
        int nLiv = nFiori();
        random(nLiv);
    }




    private void random(int n){
        Random rand = new Random();// da mettere 0 e 1
        int cont = n;
        int r, c;
        for (int i = 0;i < campo.length; i++) {
            for (int j = 0; j < campo[0].length; j++) {
                campo[i][j] = false;
                mosse[i][j] = false;
            }
        }

        while(cont >= 0){
            r = rand.nextInt(0,campo.length);
            c = rand.nextInt(0,campo[0].length);
            if(campo[r][c] == false) {
                campo[r][c] = true;
                cont--;
            }
        }


    }
    public String mossa(int r, int c){
        int fioriTrovati =0;
        String testo = "non hai ancora vinto, continua";
        if(campo[r][c]) {
            fioriTrovati++;
        }else{
            maxBomb --;
        }

        mosse[r][c] = true;



        if (vincita(fioriTrovati) == true){
            testo = "hai vintooo!";
        }else{
            if(perdita() == false){
                testo = "hai persooo!";
            }
        }
        return testo;
    }

    private boolean vincita(int fiori){
        boolean tf = false;
        if (fiori == nFiori()){
            tf = true;
        }
        return tf;
    }

    private boolean perdita(){
        boolean tf = true;
        if (maxBomb > 0){
            tf = false;
        }
        return tf;
    }

    public void reset(float liv){
        int nLiv = nFiori();
        random(nLiv);
    }

    private int nFiori(){
        int nLiv = (int) (livello* campo.length * campo[0].length);
        return nLiv;
    }
    public String stampa(int r, int c){
        if(campo[r][c]){
        mosse[r][c] =
        String stringa = "";
        for (int i = 0;i < campo.length; i++) {
            for (int j = 0; j < campo[0].length; j++) {
                stringa += mosse[i][j];

                    }
                }

        System.out.println(stringa);
        return stringa;
    }

}




