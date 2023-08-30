package aula07;

import java.util.Random;

import static java.lang.Math.random;

public class Luta {
//Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
//Métodos Públicos
    public void marcar_Luta(Lutador L1, Lutador L2){
        if (L1.getCategoria().equals(L2.getCategoria()) && L1 != L2){
            this.aprovada = true;
            this.desafiado = L1;
            this.desafiante = L2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("***DESAFIADO***");
            this.desafiado.apresentar();
            System.out.println("***DESAFIANTE***");
            this.desafiante.apresentar();
            Random aleaorio = new Random();
            int vencedor = aleaorio.nextInt(3);//0 1 2
            switch (vencedor) {
                case 0 -> { //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatar_Luta();
                    this.desafiante.empatar_Luta();
                }
                case 1 -> {//Ganhou Desafiante
                    System.out.println("O lutador desafiante ganhou a luta!");
                    System.out.println(this.desafiado.getNome());
                    this.desafiado.ganhar_Luta();
                    this.desafiante.peder_Luta();
                }
                case 2 -> {//Ganhou desafiado
                    System.out.println("O lutador desafiado ganhou a luta!");
                    System.out.println(this.desafiante.getNome());
                    this.desafiante.peder_Luta();
                    this.desafiado.ganhar_Luta();
                }
            }
        }else {
            System.out.println("A luta não pode acontencer!");
        }
    }
//Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
