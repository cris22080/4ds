import java.util.Scanner;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int nBrani;
        CartaBrano c;
        boolean ioOkay = false;
        do{
            System.out.println("isnerisci quanti brani vuoi insierie");
            nBrani = scanner.nextInt();


            try {
                c = new CartaBrano(nBrani);
                ioOkay = true;


            }catch (Exception e) {
                System.out.printf(e.getMessage());


            }
        }while (!ioOkay);




    }
}
