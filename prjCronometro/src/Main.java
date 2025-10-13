import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CronometroGiri cronometro = null;
        int scelta;

        do {
            System.out.println("\n===== MENU CRONOMETRO GIRI =====");
            System.out.println("1. Inizia nuova gara");
            System.out.println("2. Marca un giro");
            System.out.println("3. Mostra stato attuale");
            System.out.println("4. Ferma il cronometro");
            System.out.println("5. Reset gara");
            System.out.println("0. Esci");
            System.out.print("Seleziona un'opzione: ");

            scelta = scanner.nextInt();

            switch (scelta) {
                case 1 :
                    System.out.print("Inserisci il numero di giri della gara: ");
                    try {
                        int numeroGiri = scanner.nextInt();
                        if (numeroGiri <= 0) {
                            System.out.println("Il numero di giri deve essere maggiore di zero.");
                            break;
                        }

                        cronometro = new CronometroGiri(numeroGiri);
                        cronometro.partito();
                        System.out.println("Cronometro partito per " + numeroGiri + " giri.");
                    } catch (InputMismatchException e) {
                        System.out.println("Errore: inserisci un numero valido.");
                        scanner.nextLine(); // pulizia buffer
                    }
                    break;

                case 2 :
                    if (cronometro == null) {
                        System.out.println("Devi prima iniziare una gara.");
                        break;
                    }
                    try {
                        cronometro.marcaGiro();
                        System.out.println("Giro marcato.");
                        System.out.println("Durata ultimo giro: " + cronometro.getDurataUltimoGiro() + " secondi");
                        System.out.println("Tempo totale: " + cronometro.getTempoTotale() + " secondi");
                        System.out.println("Giri rimanenti: " + cronometro.getGiriRimanenti());

                        if (cronometro.getGiriRimanenti() == 0) {
                            cronometro.fermato();
                            System.out.println("Gara completata.");
                            System.out.println("Tempo finale: " + cronometro.getTempoTotale() + " secondi");
                        }
                    } catch (IllegalStateException e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;

                case 3 :
                    if (cronometro == null) {
                        System.out.println("Nessuna gara in corso.");
                    } else {
                        System.out.println("Stato attuale:");
                        System.out.println("Tempo totale: " + cronometro.getTempoTotale() + " secondi");
                        System.out.println("Giri rimanenti: " + cronometro.getGiriRimanenti());
                        System.out.println("Ultimo giro: " + cronometro.getDurataUltimoGiro() + " secondi");
                    }
                    break;

                case 4 :
                    if (cronometro == null) {
                        System.out.println("Nessun cronometro da fermare.");
                    } else {
                        cronometro.fermato();
                        System.out.println("Cronometro fermato.");
                        System.out.println("Tempo totale registrato: " + cronometro.getTempoTotale() + " secondi");
                    }
                    break;

                case 5 :
                    if (cronometro == null) {
                        System.out.println("Nessuna gara da resettare.");
                    } else {
                        cronometro.reset();
                        System.out.println("Gara resettata. Premi '1' per ripartire con la stessa configurazione.");
                    }
                    break;

                case 0 :
                    System.out.println("Uscita dal programma.");
                    if (cronometro != null) {
                        cronometro.fermato();
                    }
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
            }

        } while (scelta != 0);

    }
}
