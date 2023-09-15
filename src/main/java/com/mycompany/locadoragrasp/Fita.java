package com.mycompany.locadoragrasp;

/**
 *
 * @author natalia
 */

public class Fita {
    private String titulo;
    private PrecoFita precoFita;

    public Fita(String titulo, PrecoFita precoFita) {
        this.titulo = titulo;
        this.precoFita = precoFita;
    }

    public String getTitulo() {
        return titulo;
    }

    public PrecoFita getPrecoFita() {
        return precoFita;
    }

    public void setPrecoFita(PrecoFita precoFita) {
        this.precoFita = precoFita;
    }

}
