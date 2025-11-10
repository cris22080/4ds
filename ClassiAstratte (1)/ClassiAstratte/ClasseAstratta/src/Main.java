import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrenotazioneCampo [] prenotazioni = new PrenotazioneCampo[10];
        String pren = "";
        int scelta = 0;
        int giorno;
        int mese;
        int anno;
        int durata;
        String nome;
        int ora;
        LocalDateTime dataInizio;
        LocalDateTime dataFine;
        int minuti;

        System.out.printf("dimmi cosa vuoi fare");
        Scanner dati = new Scanner(System.in);
        int i =0;

        do {
            scelta = dati.nextInt();
            switch (scelta){
                case 1:
                    System.out.printf("dammi un nome");
                    nome = dati.next();
                    System.out.printf("dammi un giorno");
                    giorno=dati.nextInt();
                    System.out.printf("dammi un mese");
                    mese= dati.nextInt();
                    System.out.printf("dammi un anno ");
                    anno= dati.nextInt();
                    System.out.printf("dammi l'ora di inizo");
                    ora = dati.nextInt();
                    System.out.printf("dammi i minuti");
                    minuti = dati.nextInt();


                    dataInizio = LocalDateTime.of(anno, mese, giorno, ora, minuti, 0 );
                    System.out.printf("dammi l'ora di fine");
                    ora = dati.nextInt();
                    System.out.printf("dammi i minuti");
                    minuti = dati.nextInt();
                    dataFine = LocalDateTime.of(anno, mese, giorno, ora, minuti, 0 );


                    prenotazioni[i] = new PrenotazioneCoperta(nome, dataInizio, dataFine);

                    System.out.printf("il prezzo è");

                    System.out.println(prenotazioni[i].CalcolaCosto());
                    i++;
                    break;

                case 2:
                    System.out.println("dammi un nome");
                    nome = dati.next();
                    System.out.println("dammi un giorno");
                    giorno=dati.nextInt();
                    System.out.println("dammi un mese");
                    mese= dati.nextInt();
                    System.out.printf("dammi un anno ");
                    anno= dati.nextInt();
                    System.out.printf("dammi l'ora di inizo");
                    ora = dati.nextInt();
                    System.out.printf("dammi i minuti");
                    minuti = dati.nextInt();


                    dataInizio = LocalDateTime.of(anno, mese, giorno, ora, minuti, 0 );
                    System.out.printf("dammi l'ora di fine");
                    ora = dati.nextInt();
                    System.out.printf("dammi i minuti");
                    minuti = dati.nextInt();
                    dataFine = LocalDateTime.of(anno, mese, giorno, ora, minuti, 0 );


                    prenotazioni[i] = new PrenotazioneCoperta(nome, dataInizio, dataFine);

                    System.out.printf("il prezzo è");
                    System.out.println(prenotazioni[i].CalcolaCosto());
                    i++;
                    break;

                case 3:
                    System.out.printf("dammi un nome");
                    nome = dati.next();
                    System.out.printf("dammi un giorno");
                    giorno=dati.nextInt();
                    System.out.printf("dammi un mese");
                    mese= dati.nextInt();
                    System.out.printf("dammi un anno ");
                    anno= dati.nextInt();
                    System.out.printf("dammi l'ora di inizo");
                    ora = dati.nextInt();
                    System.out.printf("dammi i minuti");
                    minuti = dati.nextInt();


                    dataInizio = LocalDateTime.of(anno, mese, giorno, ora, minuti, 0 );
                    System.out.printf("dammi l'ora di fine");
                    ora = dati.nextInt();
                    System.out.printf("dammi i minuti");
                    minuti = dati.nextInt();
                    dataFine = LocalDateTime.of(anno, mese, giorno, ora, minuti, 0 );


                    prenotazioni[i] = new PrenotazioneCoperta(nome, dataInizio, dataFine);

                    System.out.printf("il prezzo è");
                    System.out.println(prenotazioni[i].CalcolaCosto());
                    i++;
                    break;
                case 4:
                    for (int j = 0; j<i; j++){


                    pren += ""  + prenotazioni[j].tostring() + "\n";
                }
                    System.out.printf(pren);
                default:
                    break;





            }
        }while (scelta!=0);





        }
    }
