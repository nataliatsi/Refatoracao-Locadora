package com.mycompany.locadoragrasp;

public class LocadoraGRASP {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Natália");
        
        Fita fita1 = new Fita("O Exorcista", new PrecoNormal());
        Fita fita2 = new Fita("Men in Black", new PrecoNormal());
        Fita fita3 = new Fita("Jurassic Park III", new PrecoLancamento());
        Fita fita4 = new Fita("Planeta dos Macacos", new PrecoLancamento());
        Fita fita5 = new Fita("Pateta no Planeta dos Macacos", new PrecoInfantil());
        Fita fita6 = new Fita("O Rei Leao", new PrecoInfantil());

        c1.addAluguel(fita1, 3);
        c1.addAluguel(fita2, 2);
        c1.addAluguel(fita3, 3);
        c1.addAluguel(fita4, 4);
        c1.addAluguel(fita5, 10);
        c1.addAluguel(fita6, 30);

        System.out.println(c1.extrato());
    }
}