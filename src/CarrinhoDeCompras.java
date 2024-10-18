import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto>lista = new ArrayList<>();

    private DescontoStrategy strategy;

    public void setStrategy(DescontoStrategy strategy) {
        this.strategy = strategy;
    }

    public void addProduto(Produto produto){
        this.lista.add(produto);
    }
    public void removeProduto(Produto produto){
        this.lista.remove(produto);
    }

    private Double getTotalProdutos(){
        Double totalProdutos = 0.0;

        for(Produto produto : this.lista){
            totalProdutos += produto.getPreco();
        }
        return totalProdutos;
    }

    public Double calcularTotalComDesconto(){
        return this.strategy.calcularDesconto(getTotalProdutos());
    }
}
