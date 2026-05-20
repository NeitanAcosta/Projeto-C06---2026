public class IngressoVIP extends Ingresso implements Validavel {
    
    public IngressoVIP() {
    }
    
    @Override
    public double calcularValor() {
        return 0.0;
    }
    
    @Override
    public boolean validarEntrada() {
        return false;
    }
}