public abstract class Animale {
    private String nome;
    private float peso;
    private String sesso;

    public Animale(String nome, float peso, String sesso){
        this.nome = nome;
        this.sesso = sesso;
        this.peso = peso;
    }

    public abstract String versoAnimale();

    public String toString(){
        String str = "Il nome è: " + nome + " Il peso è: " + peso + " Il sesso è: " + sesso + " ";
        return str;
    }


}
