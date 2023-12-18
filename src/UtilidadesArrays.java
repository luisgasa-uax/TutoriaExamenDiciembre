public class UtilidadesArrays {
    private static void imprimirArray1Dim(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void imprimirArray2Dim(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\t" + i);
        }
    }

    private static void imprimirArray3Dim(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k <array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println("\t" + j);
            }
            System.out.println("\t" + i);
        }
    }

    private static void imprimirArray4Dim(int[][][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        System.out.print(array[i][j][k][l] + " ");
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
