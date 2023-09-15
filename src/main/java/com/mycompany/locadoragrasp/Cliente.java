package com.mycompany.locadoragrasp;

/**
 *
 * @author natalia
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cliente {
    private String nome;
    private Collection<Aluguel> alugueis = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public void addAluguel(Fita fita, int diasAlugada) {
        Aluguel aluguel = new Aluguel(fita, diasAlugada);
        alugueis.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        Iterator<Aluguel> iterator = alugueis.iterator();
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

        while (iterator.hasNext()) {
            Aluguel aluguel = iterator.next();
            double valorCorrente = aluguel.calcularPreco();
            pontosDeAlugadorFrequente += aluguel.calcularPontosFrequentes();

            resultado += aluguel.getFita().getTitulo() + "\t" + valorCorrente + fimDeLinha;
            resultado += "Valor total devido: " + valorTotal + fimDeLinha;
            resultado += "\n" + getNome() + " acumulou " + pontosDeAlugadorFrequente + " pontos de alugador frequente";
        }
        return resultado;
    }
}
