public class Caneta02 {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    void status(){
        System.out.println("Uma caneta da cor " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Qual a ponta da caneta? " + this.ponta);
        System.out.println("O modelo da caneta é " + this.modelo);
        System.out.println("Carga da caneta: " + this.carga);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rasbicar.");
        }
        else {
            System.out.println("Estou rasbicando.");
        }

    }
    public void tampar(){
        this.tampada = true;

    }
    public void destampar(){
        this.tampada = false;

    }
}
