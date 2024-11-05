public class Facil extends Recorrido {

    public Facil(double distancia) {
        super(distancia);
    }

    @Override
    public double calcularTiempoEstimado() {
        return distancia / 30.0;
    }

    @Override
    public double calcularPuntaje() {
        return 2 * distancia;
    }
}
