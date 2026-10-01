package com.javaflix;

public class Filme {

    private String nome;
    private String genero;
    private String trilhaSonora;
    private String classificacao;

    private int anoDeLancamento;
    private int duracaoEmMinutos;

    private boolean incluidoNoPlano;

    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;


    public Filme(
            String nome,
            String genero,
            String trilhaSonora,
            String classificacao,
            int anoDeLancamento,
            int duracaoEmMinutos,
            boolean incluidoNoPlano
    ) {

        this.nome = nome;
        this.genero = genero;
        this.trilhaSonora = trilhaSonora;
        this.classificacao = classificacao;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.incluidoNoPlano = incluidoNoPlano;
    }


    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }


    public double pegaMedia() {

        if (totalDeAvaliacoes == 0) {
            return 0;
        }

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


    public String getNome() {
        return nome;
    }


    public String getGenero() {
        return genero;
    }


    public String getTrilhaSonora() {
        return trilhaSonora;
    }


    public String getClassificacao() {
        return classificacao;
    }


    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }


    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }


    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }


    public double getMedia() {
        return pegaMedia();
    }


    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}