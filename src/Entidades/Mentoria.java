package Entidades;

public class Mentoria extends Conteudo {
    public Mentoria(String titulo, String descricao, Professor professor, Integer tamanho) {
        super(titulo, descricao, professor, tamanho);
    }
    @Override
    public Double xpCalculo(){


        return XP_PADRAO+ getTamanho();
    }

}
