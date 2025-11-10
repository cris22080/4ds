

public class Orso extends Animale{

    private String radioCollare;

    public Orso(String nome, float peso, String sesso, String radioCollare){
        super(nome, peso, sesso);
        this.radioCollare = radioCollare;
    }

    @Override
    public String versoAnimale() {
        return "Ruglio";
    }

    @Override
    public String toString() {
        return super.toString() + " l'orso ha il radio collare: " + radioCollare;
    }
}
