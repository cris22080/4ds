import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String animale;

        String nomeAnimale;
        float peso;
        String sesso;

        String nomeBranco; //variabili
        String radioCollare;

        String nomeBosco;
        String localita;
        float estensione;
        int nMaxAnimali;

        int decisione;
        System.out.println("Crea Bosco"); //creazione del bosco
        System.out.println("Dammi il nome del bosco: ");
        nomeBosco = input.nextLine();
        System.out.println("Dimmi la localita del bosco: ");
        localita = input.nextLine();
        System.out.println("Dammi la sua estensione in ettari: ");
        estensione = input.nextFloat();
        System.out.println("Dammi quanti animali al massimo possono convivere: ");
        nMaxAnimali = input.nextInt();

        Bosco bosco = new Bosco(nomeBosco, localita, estensione, nMaxAnimali);

        do{ //menu
            System.out.println("Menu: \n 1. Aggiungi animale al bosco \n 2. Elimina animale dal bosco \n 3. Stampa lo stato di tutti gli orsi \n 4. Stampa lo stato di tutti i lupi  \n 5. Stampa lo stato di tutti gli animali");
            decisione = input.nextInt();

            switch (decisione){
                case 1:
                    input.nextLine(); //inizializzo le variabili
                    System.out.println("Dammi la tipologia di animale da aggiungere, orso o lupo: ");
                    animale = input.nextLine();
                    System.out.println("Dammi il suo nome: ");
                    nomeAnimale = input.nextLine();
                    System.out.println("Dammi il suo peso: ");
                    peso = input.nextFloat();
                    System.out.println("Dammi il sesso dell'animale: ");
                    sesso = input.nextLine();

                    if(Objects.equals(animale, "orso")){ //controllo quale animale è stato inserito
                        input.nextLine();
                        System.out.println("Dimmi se l'orso ha il radio collare: ");
                        radioCollare = input.nextLine();
                        Orso o = new Orso(nomeAnimale, peso, sesso, radioCollare);
                        try{
                            bosco.aggiungiAnimale(o); //creo una eccezione se il bosco è pieno
                            System.out.println("Hai aggiunto un animale al bosco");
                        }catch (ExceptionMaxAnimali e){
                            System.out.println(e.getMessage());
                        }

                    }else if(Objects.equals(animale, "lupo")){
                        input.nextLine();
                        System.out.println("Dimmi in quale branco il lupo appartiene: ");
                        nomeBranco = input.nextLine();
                        Lupo l = new Lupo(nomeAnimale, peso, sesso, nomeBranco);
                        try{
                            bosco.aggiungiAnimale(l); //creo una eccezione se il bosco è pieno
                            System.out.println("Hai aggiunto un animale al bosco");
                        }catch (ExceptionMaxAnimali e){
                            System.out.println(e.getMessage());
                        }
                    }else{
                        System.out.println("L'animale inserito non è valido");
                    }
                    break;

                case 2:

                    try{
                        bosco.rimuoviAnimale(); //creo una eccezione se il bosco è vuoto
                        System.out.println("Hai rimosso l'ultimo animale aggiunto");
                    }catch (ExceptionNRimosso e){
                        System.out.println(e.getMessage());
                    }

                    break;

                case 3:
                    System.out.println(bosco.stampaOrsi());
                    break;

                case 4:
                    System.out.println(bosco.stampaLupi());
                    break;

                case 5:
                    System.out.println(bosco.stampaTuttiAnimali());
                    break;

                case 0:
                    break;

                default:
                    break;
            }
        }while(decisione != 0);
    }
}