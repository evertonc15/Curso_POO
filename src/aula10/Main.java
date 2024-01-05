package aula10;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
//        m.setPeso(85.5);
//        m.setIdade(2);
//        m.setCorDoPelo("Marrom");
//        m.setMembros(4);
//        m.emitirSom();
//        m.alimentar();
//        m.locomover();
//
//        p.setIdade(1);
//        p.setCorDaEscama("Dourado");
//        p.setPeso(0.35);
//        p.setMembros(0);
//        p.locomover();
//        p.alimentar();
//        p.emitirSom();
//        p.soltarBolhas();
//
//        a.setIdade(2);
//        a.setCorDaPena("Verde");
//        a.setPeso(0.89);
//        a.setMembros(2);
//        a.locomover();
//        a.alimentar();
//        a.emitirSom();
//        a.fazerNinho();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        c.setPeso(55.30);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();

        k.setPeso(3.94);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
    }
}
