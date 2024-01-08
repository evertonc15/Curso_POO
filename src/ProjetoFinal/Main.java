package ProjetoFinal;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 22 de Python");
        v[2] = new Video("Aula 10 de Html & CSS");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Everton", 26, "M", "evertonc15");
        g[1] = new Gafanhoto("Lamark", 22, "M", "lmax");
        System.out.println(g[0].toString());
        System.out.println(v[0].toString());
    }
}
