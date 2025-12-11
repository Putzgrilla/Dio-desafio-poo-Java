package Entidades;

import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Devs {
    private  String nome;
    private Set<Bootcamp> Bootcamps= new HashSet<>();


    public boolean fazerCurso(String bootcamp, String curso){
        return Bootcamps.stream()
                .filter(p -> Objects.equals(p.getNome(), bootcamp))
                .findFirst()
                .map(b -> b.fazerconteudo(curso))
                .orElse(false);
    }
}
