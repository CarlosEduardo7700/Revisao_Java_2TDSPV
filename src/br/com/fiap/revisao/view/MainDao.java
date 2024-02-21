package br.com.fiap.revisao.view;

import br.com.fiap.revisao.model.Calcado;
import br.com.fiap.revisao.dao.ProdutoDao;
import br.com.fiap.revisao.dao.ProdutoDaoImpl;

public class MainDao {

    public static void main(String[] args) {
        ProdutoDao dao = new ProdutoDaoImpl();
        Calcado calcado = new Calcado();

        dao.buscar();

        dao.cadastrar(calcado);
    }
}
