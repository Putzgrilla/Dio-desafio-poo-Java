package Entidades;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Bootcamp {
    private String Nome;
    private  String descricao;
    private Set<Conteudo> Conteudo = new HashSet<>();

    public Bootcamp(String nome, String descricao, Set<Entidades.Conteudo> conteudo) {
        Nome = nome;
        this.descricao = descricao;
        Conteudo = conteudo;
    }

    public  Boolean fazerconteudo(String nome){
        Optional<Entidades.Conteudo> curso = getConteudo().stream().filter(p -> Objects.equals(p.getTitulo(), nome)).findFirst();
        if (curso.isPresent()){
            curso.get().Fazer();
            return true;
        }
        return false;
    }
    public  Double XpTotal(){

      return  Conteudo.stream().mapToDouble(Entidades.Conteudo::xpCalculo).sum();
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Conteudo> getConteudo() {
        return Conteudo;
    }

    public void setConteudo(Set<Conteudo> conteudo) {
        Conteudo = conteudo;
    }

}
