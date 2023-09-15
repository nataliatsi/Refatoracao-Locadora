package com.mycompany.locadoragrasp;

/**
 *
 * @author natalia
 */

public class PrecoNormal implements PrecoFita {
    @Override
    public double calcularPreco(int diasAlugada) {
        double valorCorrente = 2;
        if (diasAlugada > 2) {
            valorCorrente += (diasAlugada - 2) * 1.5;
        }
        return valorCorrente;
    }
}
