import java.util.Random;

public class Dado{
int facce;
int [] valori;
Random rand = new Random();



public Dado(int facce, int[] valori) {
        this.facce = facce;

    }

    public int lancia() {

        int indice = rand.nextInt(facce);
        return valori[indice];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dado{facce=").append(facce).append(", valori=[");
        for (int i = 0; i < valori.length; i++) {

        }
        sb.append(valori[i]);
        if (i < valori.length - 1) {
            sb.append(", ");
        }

        sb.append("]}");
        return sb.toString();
    }

    public int getFacce() {
        return facce;
    }

    public int[] getValori() {
        return valori.clone();
    }
}

