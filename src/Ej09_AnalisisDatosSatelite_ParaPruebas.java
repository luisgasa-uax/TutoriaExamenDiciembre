public class Ej09_AnalisisDatosSatelite_ParaPruebas {
    /*
    9. **Análisis de Datos de Satélite (Array de 4 Dimensiones)**
    - **Descripción:**
        - Utilizar un array de cuatro dimensiones para almacenar datos recopilados por un satélite (por ejemplo,
        datos de temperatura, humedad, presión, y velocidad del viento) en diferentes puntos geográficos, altitudes
        y tiempos.
        - Implementar un método para extraer y analizar datos específicos de este array.
    - **Objetivo:** Manejo de arrays de cuatro dimensiones.
    - **Tipo de Dato:** `double[][][][] datosSatelite;`
    - **Métodos:**
        - `void actualizarDato(int puntoX, int puntoY, int altitud, int tiempo, double dato)`
        - `double obtenerDato(int puntoX, int puntoY, int altitud, int tiempo)`
        - `void analizarDatos()`
     */

    final static int X = 5;
    final static int Y = 5;
    final static int Z = 5;
    final static int T = 5;

    public static void main(String[] args) {
        double[][][][] datosSatelite = new double[X][Y][Z][T];
        actualizarDato(datosSatelite, 1,2,3,4, 88.9);
        System.out.println(obtenerDato(datosSatelite, 1, 2, 3, 4));
        analizarDatos(datosSatelite);
    }

    public static double[][][][] actualizarDato(double[][][][] datosSatelite, int x, int y, int z, int t, double dato) {
        datosSatelite[x][y][z][t] = dato;
        return datosSatelite;
    }

    public static double obtenerDato(double[][][][] datosSatelite, int x, int y, int z, int t) {
        return datosSatelite[x][y][z][t];
    }

    public static double analizarDatos(double[][][][] datosSatelite) {
        double acumulado = 0;
        int cantidad = X * Y * Z * T;
        for (int i = 0; i < datosSatelite.length; i++) {
            for (int j = 0; j < datosSatelite[i].length; j++) {
                for (int k = 0; k < datosSatelite[i][j].length; k++) {
                    for (int l = 0; l < datosSatelite[i][j][k].length; l++) {
                        acumulado += datosSatelite[i][j][k][l];
                    }
                }
            }
        }
        System.out.println("La media de los datos es " + acumulado + " / " + cantidad + " : " + acumulado/cantidad);
        return acumulado/cantidad;
    }
}
