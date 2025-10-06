import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int righe = 0;
        int  colonne =  0;
        int scelta = 0;
        Life game;

        do {
            System.out.println("1 se vuoi una colonia con misure random oppure 2 se vuoi una colonia con misure scelte da te ");
            scelta = scanner.nextInt();
            if (scelta == 2) {
                System.out.println("Dammi il numero di colonne (deve essere un rettangolo): ");
                colonne = scanner.nextInt();
                System.out.println("Dammi il numero di righe (deve essere un rettangolo): ");
                righe = scanner.nextInt();
                game = new Life(righe, colonne);
            }else{
                game = new Life();
            }
        }while((righe == colonne) && (righe > 0));



        System.out.println(game.toString());

        do {
            System.out.println();
            System.out.println("Cosa desiderate fare? ");
            System.out.println("1. Resettare il gioco");
            System.out.println("2. evolvi il gioco");
            System.out.println("3. Uscire");
            scelta = scanner.nextInt();
            switch(scelta){
                case 1:
                    game.setColonia();
                    System.out.println("Colonia resettata correttamente!");
                    System.out.println();
                    System.out.println(game.toString());
                    break;
                case 2:
                    game.evoluzione();
                    System.out.println(game.toString());
                    break;
                default:
                    System.out.println("scelta invalida!");
            }
            System.out.println();
        }while(scelta != 3);
    }
}




