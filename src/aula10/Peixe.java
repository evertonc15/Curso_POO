package aula10;

public class Peixe extends Animal{
    private String corDaEscama;
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Substancias");
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }
    public void soltarBolhas(){
        System.out.println("Soltou uma bolha");
    }
    public String getCorDaEscama() {
        return corDaEscama;
    }
    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
}
