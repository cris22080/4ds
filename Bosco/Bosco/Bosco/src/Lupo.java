

public class Lupo extends Animale{
    private String nomeBranco;

    public Lupo(String nome, float peso, String sesso, String nomeBranco){
        super(nome, peso, sesso);
        this.nomeBranco = nomeBranco;
    }

    @Override
    public String versoAnimale() {
        return "Ululato";
    }


    @Override
    public String toString() {
        return super.toString() + " l'orso ha il radio collare: " + nomeBranco;
    }
}
