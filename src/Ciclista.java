import java.util.ArrayList;
import java.util.List;

public class Ciclista {
    public String nombre;
    public double velocidadPromedio;
    public List<Recorrido> recorridos;
    public boolean esExperto;

    public Ciclista(String nombre, double velocidadPromedio, boolean esExperto) {
        this.nombre = nombre;
        this.velocidadPromedio = velocidadPromedio;
        this.recorridos = new ArrayList<>();
        this.esExperto = esExperto;
    }

    public void agregarRecorrido(Recorrido recorrido) {
        recorridos.add(recorrido);
    }

    public double calcularPuntajeTotal() {
        double puntaje = 0;
        for (Recorrido recorrido : recorridos) {
            puntaje += recorrido.calcularPuntaje();
        }
        return esExperto ? puntaje * 0.9 : puntaje;
    }


    public double calcularTiempoTotal() {
        double tiempoTotal = 0;
        for (Recorrido recorrido : recorridos) {
            tiempoTotal += recorrido.calcularTiempoEstimado();
        }
        return tiempoTotal;
    }

    public double calcularDistanciaTotal() {
        double distanciaTotal = 0;
        for (Recorrido recorrido : recorridos) {
            distanciaTotal += recorrido.getDistancia();
        }
        return distanciaTotal;
    }

    public boolean completaraEnMenosDe2Horas() {
        double distanciaTotal = calcularDistanciaTotal();
        return distanciaTotal / velocidadPromedio < 2;
    }

    public String getNombre() {
        return nombre;
    }
}
