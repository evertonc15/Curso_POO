package aula07;

public class Lutador {
//Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
//Métodos Públicos
    public void apresentar(){
        System.out.println("-------------------------------------------------------");
        System.out.println("CHEGOU A HORA! APRESENTAMOS O LUTADOR... " + this.getNome());
        System.out.println("Diretamente do(a)... " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "m");
        System.out.println("Pesando: " + this.getPeso() + "Kgs");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
        System.out.println("-------------------------------------------------------");
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso: " + getCategoria());
        System.out.println(this.getVitorias() + " Vitórias.");
        System.out.println(this.getDerrotas() + " Derrotas.");
        System.out.println(this.getEmpates() + " Empates.");
    }
    public void ganhar_Luta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void peder_Luta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatar_Luta(){
        this.setEmpates(this.getEmpates() + 1);
    }
//Métodos Especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2){
            this.categoria = "Inválido";
        }else if(peso <= 72.3){
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
