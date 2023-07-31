package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC","Azul",0.7f);
        c1.Status();
        System.out.println("________________________________________");
        Caneta c2 = new Caneta("COMPACTOR", "Vermelha",0.7f);
        c2.Status();
    }
}
