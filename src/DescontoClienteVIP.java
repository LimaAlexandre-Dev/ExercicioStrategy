public class DescontoClienteVIP implements DescontoStrategy{
    private Double descontoVIP= 20.0;
    @Override
    public double calcularDesconto(double preco) {
        return preco -((descontoVIP/100) * preco);
    }
}
