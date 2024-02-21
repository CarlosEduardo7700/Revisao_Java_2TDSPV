package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.model.Produto;

import java.util.List;

public class ProdutoDaoImpl implements ProdutoDao {
    @Override
    public List<Produto> buscar() {
        System.out.println("Buscando...");
        return null;
    }

    @Override
    public Produto cadastrar(Produto produto) {
        System.out.println("Cadastrando...");
        return null;
    }
}
