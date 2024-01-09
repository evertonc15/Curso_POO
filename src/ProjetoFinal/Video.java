package ProjetoFinal;

public class Video implements IAcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproducao;
    public Video(String titulo){
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproducao = false;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao) / this.views;
        this.avaliacao = nova;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean isReproducao() {
        return reproducao;
    }
    public void setReproducao(boolean reproducao) {
        this.reproducao = reproducao;
    }
    @Override
    public void play() {
        this.reproducao = true;
    }
    @Override
    public void pause() {
        this.reproducao = false;
    }
    @Override
    public void like() {
        this.curtidas ++;
    }
    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproducao=" + reproducao +
                '}';
    }
}
