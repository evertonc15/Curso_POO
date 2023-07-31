public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Qual a ponta da caneta? " + this.ponta);
        System.out.println("O modelo da caneta é " + this.modelo);
        System.out.println("Carga da caneta: " + this.carga);
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rasbicar.");
        }
        else {
            System.out.println("Estou rasbicando.");
        }

    }
    void tampar(){
        this.tampada = true;

    }
    void destampar(){
        this.tampada = false;

    }
}
