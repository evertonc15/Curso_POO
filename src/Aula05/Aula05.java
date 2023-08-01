package Aula05;

public class Aula05 {
    public static void main(String[] args) {
        BancoNu p1 = new BancoNu();
        p1.setNum_Conta(1111);
        p1.setDono("Everton");
        p1.abrir_Conta("CC");
        p1.estado_Atual();
        p1.depositar(100);
        p1.sacar(150);
        p1.fechar_Conta();
        System.out.println("____________________________________");
        BancoNu p2 = new BancoNu();
        p2.setNum_Conta(2222);
        p2.setDono("Lamark");
        p2.abrir_Conta("CP");
        p2.estado_Atual();
        p2.depositar(220);
    }
}
