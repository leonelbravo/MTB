public class Dificil extends Recorrido{

    public int obstaculos;

    public Dificil(double distancia, int obstaculos) {
        super(distancia);
        this.obstaculos = obstaculos;
    }

    @Override
    public double calcularTiempoEstimado() {
        return (distancia / 20.0) * obstaculos;
    }

    @Override
    public double calcularPuntaje() {
        return 0.5 * distancia;
    }
}
