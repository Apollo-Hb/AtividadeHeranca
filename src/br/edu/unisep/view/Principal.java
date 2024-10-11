package br.edu.unisep.view;

import br.edu.unisep.model.Frota;
import br.edu.unisep.model.Carro;
import br.edu.unisep.model.Moto;
import br.edu.unisep.model.Caminhao;

public class Principal {
    public static void main(String[] args) {
        Frota frota = new Frota();

        Carro carro = new Carro("Ford", "Focus", 2015, 4);
        Moto moto = new Moto("Honda", "CG 160", 2018, 160);
        Caminhao caminhao = new Caminhao("Mercedes-Benz", "Actros", 2020, "Carga pesada");

        frota.adicionarVeiculo(carro);
        frota.adicionarVeiculo(moto);
        frota.adicionarVeiculo(caminhao);

        carro.exibirDetalhes();
        moto.exibirDetalhes();
        caminhao.exibirDetalhes();

        System.out.println();
        frota.exibirDetalhesFrota();
    }
}