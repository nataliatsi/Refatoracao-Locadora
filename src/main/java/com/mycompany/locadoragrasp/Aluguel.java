package com.mycompany.locadoragrasp;

/**
 *
 * @author natalia
 */

public class Aluguel {
    private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public double calcularPreco() {
        return fita.getPrecoFita().calcularPreco(diasAlugada);
    }

    public int calcularPontosFrequentes() {
        int pontosDeAlugadorFrequente = 1;

        if (fita.getPrecoFita() instanceof PrecoLancamento && diasAlugada > 1) {
            pontosDeAlugadorFrequente++;
        }

        return pontosDeAlugadorFrequente;
    }

}
