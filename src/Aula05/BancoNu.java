package Aula05;
//Atributos
public class BancoNu {
    public int num_Conta;
    protected String tipo_Conta;
    private String dono;
    private float saldo;
    private boolean status;
    //Métodos Especiais

    public BancoNu() {
       this.setSaldo(0);
       this.setStatus(false);
    }

    public int getNum_Conta() {
        return this.num_Conta;
    }
    public void setNum_Conta(int n) {
        this.num_Conta = n;
    }
    public String getTipo_Conta() {
        return this.tipo_Conta;
    }
    public void setTipo_Conta(String t) {
        this.tipo_Conta = t;
    }
    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean st) {
        this.status = st;
    }
    public void estado_Atual(){
        System.out.println("_________________________________");
        System.out.println("Conta: " + this.getNum_Conta());
        System.out.println("Tipo: " + this.getTipo_Conta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    //Métodos Personalizados
    public void abrir_Conta(String t) {
        this.setTipo_Conta(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fechar_Conta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechado, pois ainda está com dinheiro.");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta não pode ser fechado, pois está em débito.");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada com sucesso!");
    }
    public void sacar(float v){
        if(this.getStatus()){
            if(getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realiazido na conta de " + getDono());
            }else{
                System.out.println("Saldo insuficiente para saque.");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossível realizar o deposito.");
        }
    }
    public void pagar_Mensal(){
            int v = 0;
            if(this.getTipo_Conta() == "CC"){
                v = 12;
            }else if(getTipo_Conta() == "CP"){
                v = 20;
            }
            if(this.getStatus()){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + getDono());
            }else{
                System.out.println("Impossível pagar a mensalidade.");
            }
        }
    }
}
