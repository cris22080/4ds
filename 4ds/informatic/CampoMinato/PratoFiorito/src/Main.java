import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int temp = 0;
        int r, c;
        System.out.println("dimmi la grandezza del tabellone");
        r = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println("ciao di che livello vuoi il gioco 0,3 facile,  0,5 base e 0,6 difficile");
        float liv = scanner.nextFloat();
        System.out.println("dimmi quante bombe serivanno per perder");
        int bomb = scanner.nextInt();
        CampoMinato game = new CampoMinato(r, c, liv, bomb);
        System.out.println("dimmi le cordinate della cella, ordine righe e colonne");
        r = scanner.nextInt();
        c = scanner.nextInt();
        System.out.println(game.mossa(r, c) + game.stampa(r, c));

        do {


            System.out.println("2) continua il gioco");
            System.out.println("3) reset gioco");
            temp = scanner.nextInt();

            switch (temp) {
                case 2:
                    System.out.println("dimmi le cordinate della cella, ordine righe e colonne");
                    r = scanner.nextInt();
                    c = scanner.nextInt();
                    System.out.println(game.mossa(r, c) + game.stampa(r, c));
                case 3:
                    System.out.println("ciao di che livello vuoi il gioco 0,3 facile,  0,5 base e 0,6 difficile");
                    liv = scanner.nextFloat();
                    game.reset(liv);

            }
        }while(temp<4);
    }
}