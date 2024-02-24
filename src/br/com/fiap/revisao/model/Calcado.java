package br.com.fiap.revisao.model;

public class Calcado extends Produto {

    private Float tamanho;
    private TipoCalcado tipo;


    public Calcado() {}

    public Calcado(Long id, String nome, Double preco, Float tamanho) {
        super(id, nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public double calcularDesconto(String cupom) {
        if (cupom.equals("CALCADO40")) {
            return getPreco() * 0.6;
        }
        return super.calcularDesconto(cupom);
    }

    public void setTamanho(Float tamanho) {
        this.tamanho = tamanho;
    }

    public Float getTamanho() {
        return tamanho;
    }

    public TipoCalcado getTipo() {
        return tipo;
    }

    public void setTipo(TipoCalcado tipo) {
        this.tipo = tipo;
    }
}
