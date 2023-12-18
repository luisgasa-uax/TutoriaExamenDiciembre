import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ej09_AnalisisDatosSatelite_ParaPruebasTest {

    @Test
    void actualizarDato() {
        double[][][][] datosSatelite = new double[2][2][2][2];
        double nuevoDato = 5.5;
        datosSatelite = Ej09_AnalisisDatosSatelite_ParaPruebas.actualizarDato(datosSatelite, 1, 1, 1, 1, nuevoDato);
        assertEquals(nuevoDato, datosSatelite[1][1][1][1]);
    }
    @Test
    void testActualizarDatoEnLimites() {
        double[][][][] datosSatelite = new double[2][2][2][2];
        double nuevoDato = 3.3;
        datosSatelite = Ej09_AnalisisDatosSatelite_ParaPruebas.actualizarDato(datosSatelite, 0, 0, 0, 0, nuevoDato);
        assertEquals(nuevoDato, datosSatelite[0][0][0][0]);
    }

    @Test
    void testActualizarDatoConIndicesInvalidos() {
        double[][][][] datosSatelite = new double[2][2][2][2];
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Ej09_AnalisisDatosSatelite_ParaPruebas.actualizarDato(datosSatelite, 3, 3, 3, 3, 4.4);
        });
    }

    @Test
    void testActualizarDatoConMatrizNula() {
        assertThrows(NullPointerException.class, () -> {
            Ej09_AnalisisDatosSatelite_ParaPruebas.actualizarDato(null, 1, 1, 1, 1, 2.2);
        });
    }

    @Test
    void obtenerDato() {
    }

    @Test
    void analizarDatos() {
    }
}