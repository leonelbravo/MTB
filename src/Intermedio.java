public class Intermedio extends Recorrido{
    public boolean pendienteAscendente;

    public Intermedio(double distancia) {
        super(distancia);
    }

    @Override
    public double calcularTiempoEstimado() {
        double indice = pendienteAscendente ? 1.5 : 0.5;
        return (distancia / 25.0) * indice;
    }

    @Override
    public double calcularPuntaje() {
        double indice = pendienteAscendente ? 1.5 : 0.5;
        return 1 + indice;
    }
}
