public class DescontoClienteRegular implements DescontoStrategy{
    private Double descontoRegular= 10.0;
    @Override
    public double calcularDesconto(double preco) {
        return preco -((descontoRegular/100) * preco);
    }
}
