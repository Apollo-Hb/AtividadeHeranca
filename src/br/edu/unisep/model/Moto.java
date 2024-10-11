package br.edu.unisep.model;

public class Moto extends Veiculo {
    private int cilindrada;

    // Construtor
    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirInformacoesBasicas();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}