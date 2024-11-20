import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CarreraTest {

    @Test
    public void testObtenerCiclistasConPuntajeSuperiorA() {
        Carrera carrera = new Carrera();

        Ciclista ciclista1 = new Ciclista("Ana", 25, false);
        Ciclista ciclista2 = new Ciclista("Luis", 30, false);

        ciclista1.agregarRecorrido(new Facil(20)); // Puntaje: 40
        ciclista2.agregarRecorrido(new Intermedio(10, true)); // Puntaje: 2.5

        carrera.agregarCiclista(ciclista1);
        carrera.agregarCiclista(ciclista2);

        List<Ciclista> ciclistas = carrera.obtenerCiclistasConPuntajeSuperiorA(30);
        assertEquals(1, ciclistas.size());
        assertEquals("Ana", ciclistas.get(0).getNombre());
    }

    @Test
    public void testObtenerCiclistaConMayorTiempo() {
        Carrera carrera = new Carrera();

        Ciclista ciclista1 = new Ciclista("Ana", 25, false);
        Ciclista ciclista2 = new Ciclista("Luis", 30, false);

        ciclista1.agregarRecorrido(new Facil(100)); // Tiempo: 3.33
        ciclista2.agregarRecorrido(new Intermedio(100, true)); // Tiempo: 6

        carrera.agregarCiclista(ciclista1);
        carrera.agregarCiclista(ciclista2);

        Ciclista ciclistaMayorTiempo = carrera.obtenerCiclistaConMayorTiempo();
        assertEquals("Luis", ciclistaMayorTiempo.getNombre());
    }

    @Test
    public void testAlgunCiclistaTerminaraEnMenosDe2Horas() {
        Carrera carrera = new Carrera();

        Ciclista ciclista1 = new Ciclista("Ana", 15, false);
        Ciclista ciclista2 = new Ciclista("Luis", 50, false);

        ciclista1.agregarRecorrido(new Facil(10)); // Tiempo esperado: 0.66
        ciclista2.agregarRecorrido(new Facil(30)); // Tiempo esperado: 0.6

        carrera.agregarCiclista(ciclista1);
        carrera.agregarCiclista(ciclista2);

        assertTrue(carrera.algunCiclistaTerminaraEnMenosDe2Horas());
    }
    @Test
    public void testObtenerPuntajeMayorA30() {
        Carrera carrera = new Carrera();

        Ciclista ciclista1 = new Ciclista("Juan", 25, false);
        Ciclista ciclista2 = new Ciclista("Ana", 30, true);
        Ciclista ciclista3 = new Ciclista("Luis", 28, false);

        ciclista1.agregarRecorrido(new Intermedio(100, true));
        ciclista1.agregarRecorrido(new Dificil(60, 3));

        ciclista2.agregarRecorrido(new Intermedio(150, true));
        ciclista2.agregarRecorrido(new Dificil(100, 4));

        ciclista3.agregarRecorrido(new Facil(100));
        ciclista3.agregarRecorrido(new Intermedio(150, false));

        carrera.agregarCiclista(ciclista1);
        carrera.agregarCiclista(ciclista2);
        carrera.agregarCiclista(ciclista3);

        List<Ciclista> ciclistasFiltrados = carrera.obtenerPuntajeMayorA30();

        assertEquals(2, ciclistasFiltrados.size());
        assertEquals("Juan", ciclistasFiltrados.get(0).getNombre());
    }
}
