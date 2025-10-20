import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int giri = 0, secondi = 0;
        Cronometro cronometro = null;


        do {
            System.out.println("Dammi il numero di giri: ");
            giri = input.nextInt();
            try {
                cronometro = new Cronometro(giri);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        } while (giri <= 0);

        Pilota p = new Pilota("Rossi");
        Gara gara = new Gara(p, giri);
        gara.assegnaPilota(p);


        int scelta = 0;
        do {
            System.out.println();
            System.out.println("Cosa volete fare?\n 1) Marca il giro\n 2) Ottieni durata dell'ultimo giro\n 3) Ottieni il tempo totale\n " +
                    "4) Ottieni i giri rimanenti\n 5) Partire \n 6) Creare una Gara \n 7)Assegnare/cambiare Pilota \n 8) Avviare la gara e proseguire con la gara \n 9) Mostrare stato \n 0) Uscire");
            scelta = input.nextInt();
            System.out.println();


            switch (scelta) {
                case 1:
                    try {
                        System.out.println("Dammi i secondi: ");
                        secondi = input.nextInt();
                        cronometro.marcaGiro(secondi);

                    } catch (JavaInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Durata dell'ultimo giro: " + cronometro.getDurataUltimoGiro());
                    break;
                case 3:
                    System.out.println("Tempo totale trascorso: " + cronometro.getTempoTotale());
                    break;
                case 4:
                    System.out.println("Giri rimanenti: " + cronometro.getGiriRimanenti());
                    break;
                case 5:
                    try {
                        System.out.println("Dammi i secondi di partenza: ");
                        secondi = input.nextInt();
                        cronometro.partito(secondi);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 6:

                    //Creare una gara
                    gara.avvia(0);
                    System.out.println("Hai creato un gara");
                    break;

                case 7:

                    //assegnare nome pilota o cambiare
                    System.out.println("Dammi il nome del pilota");
                    String nome = input.next();
                    gara.getPilota().setNome(nome);
                    System.out.println("Hai cambiato il nome del pilota");

                    break;

                case 8:
                    if(!gara.getInEsecuzione()){
                        gara.avvia(0);
                    }
                    //avviare la gara
                    System.out.println("Dammi i secondi: ");
                    int second = input.nextInt();
                    gara.marcaGiro(second, gara.numeroGiro());

                    if(gara.conclusa()){ //vedere se la gara è finita
                        System.out.println("Hai concluso la gara questi sono i risultati: \n");
                        for(int i = 0; i < gara.getNTotGiri(); i++){
                            System.out.println("Il tempo nel " + (i+1) + " Giro è: " + gara.getGiriCompletati(i));
                        }
                        scelta = 0;
                    }

                    break;

                case 9:

                    //Mostrare stato
                    for(int i = 0; i < gara.getNTotGiri(); i++){
                        System.out.println("Il tempo nel " + (i+1) + " Giro è: " + gara.getGiriCompletati(i));
                    }
                    break;

                default:
                    System.out.println("Scelta invalida");
            }
        } while (scelta != 0);
    }
}
