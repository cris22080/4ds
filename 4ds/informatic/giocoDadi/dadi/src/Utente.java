public class Utente {
String nome;
int punteggio;
int [] valori;

    public Utente(String nome, int [] valori) {
        this.nome = nome;
        this.valori =
        this.punteggio = 0;
    }

    public void addPunti(int punti) {
        this.punteggio += punti;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public String getNome() {
        return nome;
    }


    public String toString() {
        String result = "Dado{facce=" + facce + ", valori=[";
        for (int i = 0; i < valori.length; i++) {
            result += valori[i];
            if (i < valori.length - 1) {
                result += ", ";

            }
        }


        result += "]}";
        return result;
    }
}


