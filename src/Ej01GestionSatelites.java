public class Ej01GestionSatelites {
    public static void main(String[] args) {

        ej1GestionSatelites();

    }

    /*
    1. **Gestión de Satélites (Array Bidimensional)**
    - **Descripción**: Crea un programa que utilice un array bidimensional para almacenar las coordenadas (X, Y)
    de varios satélites en órbita. El usuario debe ser capaz de añadir, eliminar y modificar las coordenadas de
    estos satélites.
    - **Objetivos**: Aprender a manejar arrays bidimensionales y realizar operaciones básicas sobre ellos.
    - **Tipo de Dato:** `int[][] coordenadasSatelites;`
    - **Métodos:**
        - `void agregarSatelite(int x, int y)`
        - `void eliminarSatelite(int indice)`
        - `void modificarCoordenadas(int indice, int nuevoX, int nuevoY)`
        - `void mostrarSatelites()`
     */
    private static void ej1GestionSatelites() {
        int EJEX = 10;
        int EJEY = 10;
        int[][] coordenadasSatelites = new int[EJEX][EJEY];

        agregarSatelite(coordenadasSatelites, 5, 7, 53);
        mostrarSatelites(coordenadasSatelites);
        System.out.println("movemos");
        modificarCoordenadas(coordenadasSatelites, 53, 4,9);
        mostrarSatelites(coordenadasSatelites);
        eliminarSateliteIndice(coordenadasSatelites, 53);
        mostrarSatelites(coordenadasSatelites);
    }



    public static void agregarSatelite(int[][] coordenadasSatelites, int x, int y, int indice) {
        coordenadasSatelites[x][y] = indice;
    }

    public static void eliminarSateliteCoordenadas(int[][] coordenadasSatelites, int x, int y) {
        coordenadasSatelites[x][y] = 0;
    }


    public static int[] buscarSatelite(int[][] coordenadasSatelites, int indice) {
        // devuelve la coordenada X en la posición 0 y la coordendada Y en la posición 1
        int COORD_X = 0;
        int COORD_Y = 1;
        int [] resultado = new int[2];
        for (int i = 0; i < coordenadasSatelites.length; i++) {
            for (int j = 0; j < coordenadasSatelites[i].length; j++) {
                if ( coordenadasSatelites[i][j] == indice ){
                    resultado[COORD_X] = i;
                    resultado[COORD_Y] = j;
                    return resultado;
                }
            }
        }

        // si no encontramos el índice:
        resultado[COORD_X] = -1;
        resultado[COORD_Y] = -1;
        return resultado;
    }

    public static void eliminarSateliteIndice(int[][] coordenadasSatelites, int indice) {
        /*
        for (int i = 0; i < coordenadasSatelites.length; i++) {
            for (int j = 0; j < coordenadasSatelites[i].length; j++) {
                if ( coordenadasSatelites[i][j] == indice ){
                    coordenadasSatelites[i][j] = 0;
                }
            }
        }
        */
        int coord_x, coord_y;
        int [] posicion = buscarSatelite(coordenadasSatelites, indice);
        coord_x = posicion[0];
        coord_y = posicion[1];
        if( coord_x != -1 && coord_y != -1 ){
            coordenadasSatelites[coord_x][coord_y] = 0;
            System.out.println("Satelite eliminado");
        }
        else {
            System.out.println("Índice no encontrado");
        }
    }

    public static void modificarCoordenadas(int[][] coordenadasSatelites, int indice, int nuevoX, int nuevoY){
        int coord_x, coord_y;
        int [] posicion = buscarSatelite(coordenadasSatelites, indice);
        coord_x = posicion[0];
        coord_y = posicion[1];
        if( coord_x != -1 && coord_y != -1 ) {
            coordenadasSatelites[coord_x][coord_y] = 0;
            coordenadasSatelites[nuevoX][nuevoY] = indice;
            System.out.println("Satelite movido");
        }
        else {
            System.out.println("Índice no encontrado");
        }
    }


    public static void mostrarSatelites(int[][] coordenadasSatelites) {
        UtilidadesArrays.imprimirArray2Dim(coordenadasSatelites);
    }
}