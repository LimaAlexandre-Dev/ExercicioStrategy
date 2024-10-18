//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto macarrao = new Produto("12344321", "Macarrão Galo", 39.98);
        Produto molhoTomate = new Produto("43211234", "Molho Elefante", 59.90);
        Produto salsicha = new Produto("43214321", "Salsicha Seara", 99.99);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.addProduto(macarrao);
        carrinhoDeCompras.addProduto(macarrao);
        carrinhoDeCompras.addProduto(molhoTomate);
        carrinhoDeCompras.addProduto(salsicha);
        carrinhoDeCompras.addProduto(salsicha);
        carrinhoDeCompras.addProduto(salsicha);

        carrinhoDeCompras.setStrategy(new DescontoClienteNovo());
        System.out.println("Total para cliente novo: R$ " + carrinhoDeCompras.calcularTotalComDesconto());

        carrinhoDeCompras.setStrategy(new DescontoClienteRegular());
        System.out.println("Total para cliente regular: R$ " + carrinhoDeCompras.calcularTotalComDesconto());

        carrinhoDeCompras.setStrategy(new DescontoClienteVIP());
        System.out.println("Total para cliente VIP: R$ " + carrinhoDeCompras.calcularTotalComDesconto());

    }
}