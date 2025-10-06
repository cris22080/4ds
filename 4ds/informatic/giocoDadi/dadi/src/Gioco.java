public class Gioco {
    Utente utente1;
    Utente utente2;
    Dado dado;
    int numeroTurni;

    public Gioco(String utente1, String utente2, Dado dado) {
        this.utente1 = new Utente(utente1);
        this.utente2 = new Utente(utente2);
        this.dado = dado;
        this.numeroTurni = 0;
    }

    public void gioca() {
        numeroTurni++;

        int lancio1 = dado.lancia();
        utente1.addPunti(lancio1);

        int lancio2 = dado.lancia();
        utente2.addPunti(lancio2);
    }

    public String getRisultatoTurno() {
        int lancio1 = utente1.getPunteggio() - getPunteggioPrecedente(utente1);
        int lancio2 = utente2.getPunteggio() - getPunteggioPrecedente(utente2);

        String risultato =  "Turno " + numeroTurni + ":\n" +
                utente1.getNome() + " lancia " + lancio1 + " - Punteggio totale: " + utente1.getPunteggio() + "\n" +  utente2.getNome() + " lancia " + lancio2 + " - Punteggio totale: " + utente2.getPunteggio();

        return risultato;
    }

    private int getPunteggioPrecedente(Utente utente) {
        int punteggioPrecedente = utente.getPunteggio() - (dado.lancia() / 2);

        return punteggioPrecedente; // Approssimazione
    }

    public String checkWin() {
        int punti1 = utente1.getPunteggio();
        int punti2 = utente2.getPunteggio();
        String vittoria = "";
        if (punti1 > punti2) {
            vittoria = "🎉 " + utente1.getNome() + " sta vincendo!";
        } else if (punti2 > punti1) {
            vittoria = "🎉 " + utente2.getNome() + " sta vincendo!";
        } else {
            vittoria = "⚖️  Pareggio!";
        }
        return vittoria;
    }

    public String getPunteggi() {

        String punteggi =utente1.getNome() + ": " + utente1.getPunteggio() + " punti\n" +
                utente2.getNome() + ": " + utente2.getPunteggio() + " punti";
        return punteggi;
    }

    public String getSituazioneGioco() {
        String situazione = "In testa: " + getVincitoreAttuale();

        return situazione;
    }

    private String getVincitoreAttuale() {

        String vincitore= "";
        if (utente1.getPunteggio() > utente2.getPunteggio()) {
            vincitore =  utente1.getNome();
        } else if (utente2.getPunteggio() > utente1.getPunteggio()) {
            vincitore = utente2.getNome();
        } else {
            vincitore =  "Pareggio";
        }
        return vincitore;
    }

    public void reimpostaGioco() {
        String nome1 = utente1.getNome();
        String nome2 = utente2.getNome();
        this.utente1 = new Utente(nome1);
        this.utente2 = new Utente(nome2);
        this.numeroTurni = 0;
    }

    public void cambiaNomi(String nome1, String nome2) {
        this.utente1 = new Utente(nome1);
        this.utente2 = new Utente(nome2);
        this.numeroTurni = 0;
    }

    public void cambiaDado(Dado nuovoDado) {
        this.dado = nuovoDado;
    }

    public String toString() {

        String stampa = "Gioco{\n" +
                "  utente1=" + utente1 + ",\n" +
                "  utente2=" + utente2 + ",\n" +
                "  dado=" + dado + ",\n" +
                "  numeroTurni=" + numeroTurni + "\n" +
                "}";
        return stampa;
    }

    public Utente getUtente1() {
        return utente1;
    }

    public Utente getUtente2() {
        return utente2;
    }

    public int getNumeroTurni() {
        return numeroTurni;
    }

    public Dado getDado() {
        return dado;
    }

        }
