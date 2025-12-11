package Entidades;

public class Conteudo {
    protected static final Double XP_PADRAO= 10d;
    private  String titulo;
    private  String descricao;
    private  Professor professor;
    private Integer tamanho;
    private Boolean feito= false;

    public Conteudo(String titulo, String descricao, Professor professor,Integer tamanho) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.professor = professor;
        this.tamanho=tamanho;
    }
    public  Double xpCalculo()
    {
        if (getFeito()){
            return  tamanho*XP_PADRAO;
        }
        return 0d;
    }
    public Double Xpesperado(){

        return tamanho*XP_PADRAO;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", professor=" + professor +
                '}';
    }

    public Boolean getFeito() {
        return feito;
    }

    public void Fazer() {
        feito =true;
    }
}
