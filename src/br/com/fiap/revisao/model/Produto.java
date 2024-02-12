package br.com.fiap.revisao.model;

public class Produto {

    // Atributos
    private Long id;
    private String nome;
    private Double preco;



    // Construtores
    public Produto() {}

    public Produto(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }



    // Métodos
    public double calcularDesconto(double porcentagem) {
        return preco - preco * (porcentagem / 100);
    }

    public double calcularDesconto(String cupom) {
        if (cupom.equals("FIAP20")) {
            return preco * 0.8;
        }
        return preco;
    }



    // Getter e Setter
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

}
