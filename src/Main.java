import br.com.fiap.revisao.model.Calcado;
import br.com.fiap.revisao.model.Produto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Instanciando um Produto
        Produto produto = new Produto(1l, "Celular", 2000.0);

        // Calculando desconto
        double novoPrecoProduto = produto.calcularDesconto("FIAP20");
        produto.setPreco(novoPrecoProduto);

        // Exibindo dados do Calçado
        System.out.println("Dados do Calçado:");
        System.out.println("ID: " + produto.getId());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        System.out.println(" ");

        // Instanciando um Calçado
        Calcado calcado = new Calcado(2l, "Tênis", 200.0, 41.0f);

        // Calculando desconto
        double novoPrecoCalcado = calcado.calcularDesconto("CALCADO40");
        calcado.setPreco(novoPrecoCalcado);

        // Exibindo dados do Calçado
        System.out.println("Dados do Calçado:");
        System.out.println("ID: " + calcado.getId());
        System.out.println("Nome: " + calcado.getNome());
        System.out.println("Preço: " + calcado.getPreco());
        System.out.println("Tamanho: " + calcado.getTamanho());
    }
}
