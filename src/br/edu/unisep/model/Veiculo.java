package br.edu.unisep.model;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    // Construtor
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método abstrato (para implantar o polimorfismo)
    public abstract void exibirDetalhes();

    // Método comum para todos os veículos
    public void exibirInformacoesBasicas() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }
}