package daw1.programacion;

public class Examen19022024 {
    public static void main(String[] args) throws Exception {


        /*char [][] array1 = {{'-','-','-'},{' ',' ',' '},{'-','-','-'}};
        char [][] array2 = {{' ',' ',' '},{'X','T','I'},{' ',' ',' '}};

        imprimirArray(sumarArrayBidimensional(array1, array2));





    }


    public static char [][] sumarArrayBidimensional (char[][] array1, char[][] array2){

        char caracter=' ';
        char [][] arraySumada= new char[array1.length][array1.length];

        for (int i = 0; i < array1.length ; i++) {
            for (int j = 0; j <array1.length ; j++) {
                arraySumada[i][j]=array1[i][j];

            }
            System.out.println();
        }

        for (int i = 0; i < array2.length ; i++) {
            for (int j = 0; j <array2.length ; j++) {
                if (arraySumada[i][j]==caracter){
                    arraySumada[i][j]=array2[i][j];

                }

            }
            System.out.println();
        }


    return arraySumada;
    }

    public static void imprimirArray (char[][]nuevaMatriz) {
        for (int i = 0; i < nuevaMatriz.length; i++) {
            for (int j = 0; j < nuevaMatriz.length; j++) {
                System.out.print(nuevaMatriz[i][j] + " ");

            }
            System.out.println();
        }*/

        char[][] array1 = {
                {'-', '-', '-', '-', '-', '-'},
                {'-', 'H', 'O', 'L', 'A', '-'},
                {'-', ' ', ' ', ' ', ' ', '-'},
                {'M', 'U', 'N', 'D', 'O', ' '}
        };
        char[][] array2 = {
                {'*', '*', '*', '*', '*', '*'},
                {'B', 'U', 'E', 'N', 'A', 'S'},
                {'*', ' ', 'T', 'U', ' ', '*'},
                {'*', '*', '*', '*', '*', '*'}
        };

        imprimirArray(array1);
        System.out.println();
        imprimirArray(array2);
        System.out.println();
        char[][] arrayFinal = solaparArrays(array1, array2);
        imprimirArray(arrayFinal);

        // EJERCICIO 2

        CorredorDeMaraton corredor = new CorredorDeMaraton("30263977W", "Juan Carlos", "Salés", "31/3/2000");
        System.out.println(corredor);
        System.out.println(corredor.getEdad());

    }


    public static char[][] solaparArrays(char[][] array1, char[][] array2) {
        char[][] arraySolapado = array1;
        for (int i = 0; i < arraySolapado.length; i++) {
            for (int j = 0; j < arraySolapado[i].length; j++) {
                if (arraySolapado[i][j] == ' ') {
                    arraySolapado[i][j] = array2[i][j];
                }
            }
        }

        return arraySolapado;
    }

    public static void imprimirArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }


}
