import java.util.ArrayList;
import java.util.List;

public class Carrera {
    public List<Ciclista> ciclistas;

    public Carrera() {
        this.ciclistas = new ArrayList<>();
    }

    public void agregarCiclista(Ciclista ciclista) {
        ciclistas.add(ciclista);
    }

    public List<Ciclista> obtenerCiclistasConPuntajeSuperiorA(double puntajeMinimo) {
        List<Ciclista> resultado = new ArrayList<>();
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.calcularPuntajeTotal() > puntajeMinimo) {
                resultado.add(ciclista);
            }
        }
        return resultado;
    }

    public Ciclista obtenerCiclistaConMayorTiempo() {
        Ciclista ciclistaMayorTiempo = null;
        double mayorTiempo = 0;
        for (Ciclista ciclista : ciclistas) {
            double tiempoCiclista = ciclista.calcularTiempoTotal();
            if (tiempoCiclista > mayorTiempo) {
                mayorTiempo = tiempoCiclista;
                ciclistaMayorTiempo = ciclista;
            }
        }
        return ciclistaMayorTiempo;
    }

    public boolean algunCiclistaTerminaraEnMenosDe2Horas() {
        for (Ciclista ciclista : ciclistas) {
            if (ciclista.completaraEnMenosDe2Horas()) {
                return true;
            }
        }
        return false;
    }
}
