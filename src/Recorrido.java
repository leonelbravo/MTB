public abstract class Recorrido {
    public double distancia;

    public Recorrido(double distancia) {
        this.distancia = distancia;
    }

    public abstract double calcularTiempoEstimado();
    public abstract double calcularPuntaje();

    public double getDistancia() {
        return distancia;
    }
}