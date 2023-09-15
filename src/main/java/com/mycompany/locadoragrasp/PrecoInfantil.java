package com.mycompany.locadoragrasp;

/**
 *
 * @author natalia
 */

public class PrecoInfantil implements PrecoFita {
    @Override
    public double calcularPreco(int diasAlugada) {
        double valorCorrente = 1.5;
        if (diasAlugada > 3) {
            valorCorrente += (diasAlugada - 3) * 1.5;
        }
        return valorCorrente;
    }
}