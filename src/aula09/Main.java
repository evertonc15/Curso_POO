package aula09;

public class Main {
    public static void main(String[] args) {
//        Visitante v1 = new Visitante();
//        v1.setNome("Joao");
//        v1.setIdade(15);
//        v1.setSexo("M");
//        System.out.println(v1.toString());
//        Aluno a1 = new Aluno();
//        a1.setNome("Everton");
//        a1.setIdade(26);
//        a1.setSexo("M");
//        a1.setCurso("CC");
//        a1.setMatricula(20150070);
//        a1.pagarMensalidade();
//        Bolsista b1 = new Bolsista();
//        b1.setMatricula(20235555);
//        b1.setNome("kaue");
//        b1.setBolsa(12.5);
//        b1.setSexo("M");
//        b1.pagarMensalidade();
        Tecnico t1 = new Tecnico();
        t1.setIdade(29);
        t1.setCurso("ADS");
        t1.setNome("Kaique");
        t1.setMatricula(2154896);
        t1.setSexo("M");
        t1.setRegistroProfissional("95006587bta");
        t1.praticar();
        Professor p1 = new Professor();
        p1.setSalario(14500);
        p1.setSexo("F");
        p1.setIdade(34);
        p1.setNome("Dolores");
        p1.setEspecialidade("Doutora");
        p1.receberAumento(2000.70);
    }
}
