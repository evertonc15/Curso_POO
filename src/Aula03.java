public class Aula03 {
    public static void main(String[] args) {
        Caneta02 c1 = new Caneta02();
        c1.modelo = "BIC";
        c1.cor = "Preta";
        //c1.ponta = 0.7f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.rabiscar();
        c1.status();
    }
}
