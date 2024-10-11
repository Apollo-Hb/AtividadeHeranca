package br.edu.unisep.model;

public class Caminhao extends Veiculo {
    private String tipoCarga;


    public Caminhao(String marca, String modelo, int ano, String tipoCarga) {
        super(marca, modelo, ano);
        this.tipoCarga = tipoCarga;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirInformacoesBasicas();
        System.out.println("Tipo de carga: " + tipoCarga);
    }
}