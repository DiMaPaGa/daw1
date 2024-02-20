package daw1.programacion;

public class Examen19022024 {
    public static void main(String[] args) {


        char [][] array1 = {{'-','-','-'},{' ',' ',' '},{'-','-','-'}};
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
        }

    }





}
