package com.mycompany.locadoragrasp;

/**
 *
 * @author natalia
 */

public class PrecoLancamento implements PrecoFita {
    @Override
    public double calcularPreco(int diasAlugada) {
        return diasAlugada * 3;
    }
}