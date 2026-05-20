public class IngressoInteira extends Ingresso implements Validavel {
    
    public IngressoInteira() {
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