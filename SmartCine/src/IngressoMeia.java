public class IngressoMeia extends Ingresso implements Validavel {
    
    public IngressoMeia() {
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