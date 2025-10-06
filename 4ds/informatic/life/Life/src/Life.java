import java.util.Random;



public class Life {
    public char[][] colonia;
    private char [][]coloniaNext;
    int r;
    int c;


    Life(int r, int c) {
        colonia = new char[r][c];
        coloniaNext = new char[r][c];
        this.r = r;
        this.c = c;
        random(r, c);
    }
    Life() {
        Random rand = new Random();
        int r,  c;
        r = rand.nextInt(99);
        c = rand.nextInt(99);
        colonia = new char[r][c];
        coloniaNext = new char[r][c];
        this.r = r;
        this.c = c;
        random(r, c);
    }


    private void random(int r, int c){
        Random rand = new Random();
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c; j++) {
                colonia[i][j] = rand.nextBoolean() ? 'X' : '\\';
            }
        }
    }

    public void evoluzione() {
        int numV = 0;
        int righe;
        int colonna;
        boolean carattere = false;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                righe = i;
                colonna = j;
                if (colonia[i][j] == 'X') {
                    carattere = true;
                } else {
                    carattere = false;
                }
                numV = controlloVicini(righe, colonna);
                if (numV < 4) {
                    switch (numV) {
                        case 0:
                            coloniaNext[i][j] = '\\';
                            break;

                        case 1:
                            coloniaNext[i][j] = '\\';
                            break;
                        case 2:
                            if (carattere) {
                                coloniaNext[i][j] = 'X';
                            } else {
                                coloniaNext[i][j] = '\\';
                            }
                            break;
                        case 3:
                            coloniaNext[i][j] = 'X';
                            break;

                    }
                }else{
                    coloniaNext[i][j]='\\';
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                colonia[i][j] = coloniaNext[i][j];
            }
        }
    }


    private int controlloVicini(int r, int c){
        int cont=0;
        for (int i = r-1; i <= r + 1; i++) {//celle adiacenti riga
            for (int j = c - 1; j <= c + 1; j++) { //celle adiacenti colonna
                //controllo che sia dentro i limiti, escludo la cella stessa e conta solo quelle vive
                if ((i >= 0) && (this.r > i) && (j >= 0) && (j < this.c) && (i != this.r) && (j != this.c)) {
                    if (colonia[i][j] == 'X') {
                        cont++;
                    }
                }
            }
        }
        if (cont > 0){
            cont = cont-1;
        }
        return cont;
    }

    public String toString() {


        String s = "";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (j == 0) {
                    s = s + "|" + colonia[i][j] + ";";
                } else {
                    if (j == c-1) {
                        s = s + colonia[i][j] + "|";
                        s = s+"\n";
                    }else{
                        s = s + colonia[i][j] + ";";
                    }

                }
            }
        }
        s = s+"ciao";
        System.out.println(s);
        return s;
    }

    public void setColonia() {
        random(r,c);
    }
}