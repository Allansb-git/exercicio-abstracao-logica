package br.edu.fatecpg.tecprog.model;
import java.util.Arrays;

public class Aluno {
    public String nome;
    public double[] notas;
    public double media;

    public Aluno(String nome, double[] notas){
        this.nome = nome;
        this.notas = notas;
    }

    public double media(){
        return Arrays.stream(notas).sum() / Arrays.stream(notas).count();
    }
    public void boletim(){
        System.out.printf("""
                -- SISTEMA ESCOLAR --
                Nome do Aluno: %s
                Notas: %s
                Média Final: %.2f
                ----------------------
                %s!
                """, this.nome, Arrays.toString(notas), media(), media() >= 7 ? "APROVADO" : "REPROVADO");
    }
}
