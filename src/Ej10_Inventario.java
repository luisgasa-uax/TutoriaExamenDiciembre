public class Ej10_Inventario {
    /*
    10. **Gestión de Inventario en la Estación Espacial (Array de 1 Dimensión)**
    - **Descripción:**
        - Desarrollar un sistema de inventario para la Estación Espacial Internacional usando un array de una dimensión que almacene objetos que representen diferentes suministros (String) (comida, equipo científico, etc.).
        - Crear métodos para agregar, eliminar y buscar suministros en el inventario.
    - **Objetivo:** Aplicación práctica de arrays unidimensionales.
    - **Tipo de Dato:** `String[] inventarioEstacion;`
    - **Métodos:**
        - `void agregarSuministro(String suministro)`
        - `boolean eliminarSuministro(String suministro)`
        - `int buscarSuministro(String suministro)`
     */

    final static int DIM = 10;

    public static void main(String[] args) {
        String[] inventarioEstacion = new String[DIM];
        agregarSuministro(inventarioEstacion, "Fruta Deshidratada");
        agregarSuministro(inventarioEstacion, "Pasta de dientes");
        buscarSuministro(inventarioEstacion, "fruta desHIDRAtada");
        eliminarSuministro(inventarioEstacion, "fRuTa DeShIdRaTaDa");
        agregarSuministro(inventarioEstacion, "Cepillo de dientes");
        imprimirInventario(inventarioEstacion);
    }

    private static void imprimirInventario(String[] inventarioEstacion) {
        for (int i = 0; i < inventarioEstacion.length; i++) {
            System.out.println(inventarioEstacion[i]);
        }
    }

    public static int buscarHueco(String[] inventarioEstacion){
        for (int i = 0; i < inventarioEstacion.length; i++) {
            if( inventarioEstacion[i] == null ) { // son iguales
                return i;
            }
        }
        return -1;
    }

    public static void agregarSuministro(String[] inventarioEstacion, String suministro) {
        int posicionVacia = buscarHueco(inventarioEstacion);

        if( posicionVacia >= 0 ){
            inventarioEstacion[posicionVacia] = suministro;
        }
        else {
            System.out.println("Ya no queda hueco para guardar nada ");
        }
    }

    public static boolean eliminarSuministro(String[] inventarioEstacion, String suministro) {
        int posicion = buscarSuministro(inventarioEstacion, suministro);

        if( posicion >= 0 ){
            System.out.println("Eliminamos " + inventarioEstacion[posicion] + " del inventario");
            inventarioEstacion[posicion] = null;
            return true;
        }
        else{
            System.out.println("Este suministro no existe en nuestro inventario");
            return false;
        }
    }

    public static int buscarSuministro(String[] inventarioEstacion, String suministro) {
        for (int i = 0; i < inventarioEstacion.length; i++) {
            if( inventarioEstacion[i] != null && inventarioEstacion[i].compareToIgnoreCase(suministro) == 0 ){
                return i;
            }
        }
        return -1;
    }
}
