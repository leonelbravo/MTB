import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CiclistaTest {

    @Test
    public void testCalcularPuntajeTotal() {
        Ciclista ciclista = new Ciclista("Juan", 25, false);

        ciclista.agregarRecorrido(new Facil(100)); // Puntaje: 200
        ciclista.agregarRecorrido(new Intermedio(50, true)); // Puntaje: 2.5
        ciclista.agregarRecorrido(new Dificil(30, 2)); // Puntaje: 15

        double puntajeTotalEsperado = 200 + 2.5 + 15;
        assertEquals(puntajeTotalEsperado, ciclista.calcularPuntajeTotal(), 0.01);
    }

    @Test
    public void testCalcularTiempoTotal() {
        Ciclista ciclista = new Ciclista("Pedro", 20, false);

        ciclista.agregarRecorrido(new Facil(120)); // Tiempo: 4
        ciclista.agregarRecorrido(new Intermedio(60, true)); // Tiempo: 3.6
        ciclista.agregarRecorrido(new Dificil(100, 3)); // Tiempo: 15

        double tiempoTotalEsperado = 4 + 3.6 + 15;
        assertEquals(tiempoTotalEsperado, ciclista.calcularTiempoTotal(), 0.01);
    }

    @Test
    public void testCalcularDistanciaTotal() {
        Ciclista ciclista = new Ciclista("Maria", 18, false);

        ciclista.agregarRecorrido(new Facil(100)); // Distancia: 100
        ciclista.agregarRecorrido(new Intermedio(200, false)); // Distancia: 200
        ciclista.agregarRecorrido(new Dificil(150, 1)); // Distancia: 150

        double distanciaTotalEsperada = 100 + 200 + 150;
        assertEquals(distanciaTotalEsperada, ciclista.calcularDistanciaTotal(), 0.01);
    }

    @Test
    public void testCompletaraEnMenosDe2Horas() {
        Ciclista ciclista = new Ciclista("Laura", 30, false);

        ciclista.agregarRecorrido(new Facil(50));

        assertTrue(ciclista.completaraEnMenosDe2Horas());
    }

    @Test
    public void testCompletaraEnMasDe2Horas() {
        Ciclista ciclista = new Ciclista("Carlos", 15, false);

        ciclista.agregarRecorrido(new Facil(40));

        assertFalse(ciclista.completaraEnMenosDe2Horas());
    }
}
