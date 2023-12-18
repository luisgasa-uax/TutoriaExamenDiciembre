public class Ej02_CtrlTemperaturaNaveEspacial {

    /*
    2. **Control de Temperatura en una Nave Espacial (Array Tridimensional)**
    - **Descripción**: Desarrolla un sistema que simule el control de temperatura en una nave espacial usando un array
    tridimensional. Cada posición del array representa una sección de la nave (X, Y, Z), y almacena la
    temperatura de esa sección. Implementa funciones para actualizar y mostrar las temperaturas.
    - **Objetivos**: Entender el manejo de arrays tridimensionales y aplicar recorridos sobre ellos.
    - **Tipo de Dato:** `double[][][] temperaturasNave;`
    - **Métodos:**
        - `void actualizarTemperatura(int x, int y, int z, double nuevaTemp)`
        - `double obtenerTemperatura(int x, int y, int z)`
        - `void mostrarTemperaturas()`
     */

    final static int DIM_X = 10;
    final static int DIM_Y = 10;
    final static int DIM_Z = 10;

    public static void main(String[] args) {

        double[][][] seccionesNave = new double[DIM_X][DIM_Y][DIM_Z];

        double nuevaTemp = 35.7;
        actualizarTemperatura(seccionesNave, 3, 4, 5, nuevaTemp);
        mostrarTemperaturas(seccionesNave);
        obtenerTemperatura(seccionesNave, 3, 4, 5);

    }

    public static void actualizarTemperatura(double[][][] seccionesNave, int x, int y, int z, double nuevaTemp) {
        seccionesNave[x][y][z] = nuevaTemp;
    }

    public static double obtenerTemperatura(double[][][] seccionesNave, int x, int y, int z) {
        return seccionesNave[x][y][z];
    }

    public static void mostrarTemperaturas(double[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println("\t" + j);
            }
            System.out.println("\t" + i);
        }
    }

}
