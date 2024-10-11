package br.edu.unisep.model;


public class Carro extends Veiculo {
    private int numPortas;

    // Construtor
    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirInformacoesBasicas();
        System.out.println("Número de portas: " + numPortas);
    }
}