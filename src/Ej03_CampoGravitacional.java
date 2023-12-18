public class Ej03_CampoGravitacional {
    /*
    3. **Simulación de Campo Gravitacional (Array de 4 Dimensiones)**
    - **Descripción**: Escribe un programa que simule un campo gravitacional en el espacio, utilizando un array
    de cuatro dimensiones (X, Y, Z, tiempo). Cada elemento del array debe representar la intensidad de la gravedad
    en un punto específico del espacio y en un instante de tiempo.
    - **Objetivos**: Practicar con arrays de 4 dimensiones y manejar datos complejos.
    - **Tipo de Dato:** `double[][][][] temperaturasNave;`
    - **Métodos:**
        - `void actualizarTemperatura(int x, int y, int z, double nuevaTemp)`
        - `double obtenerTemperatura(int x, int y, int z)`
        - `void mostrarTemperaturas()`
     */

    final static int X = 10;
    final static int Y = 10;
    final static int Z = 10;
    final static int T = 10;
    public static void main(String[] args) {
        double[][][][] temperaturasNave = new double[X][Y][Z][T];
        actualizarTemperatura(temperaturasNave, 2, 3, 4, 5, -270);
        obtenerTemperatura(temperaturasNave, 2, 3, 4, 5);
        mostrarTemperaturas(temperaturasNave);
    }

    static void actualizarTemperatura(double[][][][] temperaturasNave, int x, int y, int z, int t, double nuevaTemp){
        temperaturasNave[x][y][z][t] = nuevaTemp;
    }

    static double obtenerTemperatura(double[][][][] temperaturasNave, int x, int y, int z, int t){
        return temperaturasNave[x][y][z][t];
    }
    static void mostrarTemperaturas(double[][][][] temperaturasNave){
        for (int i = 0; i < temperaturasNave.length; i++) {
            for (int j = 0; j < temperaturasNave[i].length; j++) {
                for (int k = 0; k < temperaturasNave[i][j].length; k++) {
                    for (int l = 0; l < temperaturasNave[i][j][k].length; l++) {
                        System.out.print( temperaturasNave[i][j][k][l] +" \t" );
                    }
                    System.out.println("\t" + i +":"+ j+":"+k );
                }
                System.out.println("\t" + j);
            }
            System.out.println("\t" + i);
        }
    }
}
