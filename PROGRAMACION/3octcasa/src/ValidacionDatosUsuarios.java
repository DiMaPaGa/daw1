 import java.sql.SQLOutput;
import java.util.Scanner;

public class ValidacionDatosUsuarios {

    public static void main (String []args){

        Scanner scan=new Scanner(System.in);
/* Actividad de validación DNI y cuenta bancaria: se usa Switch, lo de la letra en resto de 23 (int)y 23 switch.
En lo de la cuenta corriente hay calculo matemático de ir descontando y demás */
//Validación del DNI
        System.out.println("¿Cuál es tu DNI?");
        int numDni=scan.nextInt();
        int letra= numDni%=23;

        switch (letra) {
            case 0:
                System.out.println("T");
                break;
            case 1:
                System.out.println("R");
                break;
            case 2:
                System.out.println("W");
                break;
            case 3:
                System.out.println("A");
                break;
            case 4:
                System.out.println("G");
                break;
            case 5:
                System.out.println("M");
                break;
            case 6:
                System.out.println("Y");
                break;
            case 7:
                System.out.println("F");
                break;
            case 8:
                System.out.println("P");
                break;
            case 9:
                System.out.println("D");
                break;
            case 10:
                System.out.println("X");
                break;
            case 11:
                System.out.println("B");
                break;
            case 12:
                System.out.println("N");
                break;
            case 13:
                System.out.println("J");
                break;
            case 14:
                System.out.println("Z");
                break;
            case 15:
                System.out.println("S");
                break;
            case 16:
                System.out.println("Q");
                break;
            case 17:
                System.out.println("V");
                break;
            case 18:
                System.out.println("H");
                break;
            case 19:
                System.out.println("L");
                break;
            case 20:
                System.out.println("C");
                break;
            case 21:
                System.out.println("K");
                break;
            case 22:
                System.out.println("E");
                break;
            default:
                System.out.println("Identificador no válido.");
                break;
        }
//Validación de la cuenta corriente

        int entidad=1234;

        int cifra1Entidad=(entidad/1000);
        int cifra2Entidad=(entidad/100)-(cifra1Entidad*10);
        int cifra3Entidad=(entidad/10)-(cifra2Entidad*10)-(cifra1Entidad*100);
        int cifra4Entidad=(entidad- (cifra1Entidad*1000)- (cifra2Entidad*100)- (cifra3Entidad*10));

        int cifra1Banco=5;
        int cifra2Banco=6;
        int cifra3Banco=7;
        int cifra4Banco=8;

        int cifra1NumCuenta=1;
        int cifra2NumCuenta=2;
        int cifra3NumCuenta=3;
        int cifra4NumCuenta=4;
        int cifra5NumCuenta=5;
        int cifra6NumCuenta=6;
        int cifra7NumCuenta=7;
        int cifra8NumCuenta=8;
        int cifra9NumCuenta=9;
        int cifra10NumCuenta=0;


        cifra1Entidad=cifra1Entidad*4;
        cifra2Entidad=cifra2Entidad*8;
        cifra3Entidad=cifra3Entidad*5;
        cifra4Entidad=cifra4Entidad*10;
        cifra1Banco=cifra1Banco*9;
        cifra2Banco=cifra2Banco*7;
        cifra3Banco=cifra3Banco*3;
        cifra4Banco=cifra4Banco*6;

        int digito1DC= ((cifra1Entidad+cifra2Entidad+cifra3Entidad+cifra4Entidad)+(cifra1Banco+cifra2Banco+cifra3Banco+cifra4Banco))%11;
        digito1DC=11-digito1DC;

        if (digito1DC==10){
            digito1DC=1;
            System.out.println("El primer dígito de DC es "+digito1DC);
        } else if (digito1DC==11){
            digito1DC=0;
            System.out.println("El primer dígito de DC es "+digito1DC);
        } else {
            System.out.println("El primer dígito de DC es "+digito1DC);
        }
        cifra1NumCuenta=cifra1NumCuenta*1;
        cifra2NumCuenta=cifra2NumCuenta*2;
        cifra3NumCuenta=cifra3NumCuenta*4;
        cifra4NumCuenta=cifra4NumCuenta*8;
        cifra5NumCuenta=cifra5NumCuenta*5;
        cifra6NumCuenta=cifra6NumCuenta*10;
        cifra7NumCuenta=cifra7NumCuenta*9;
        cifra8NumCuenta=cifra8NumCuenta*7;
        cifra9NumCuenta=cifra9NumCuenta*3;
        cifra10NumCuenta=cifra10NumCuenta*6;

        int digito2DC= (cifra1NumCuenta+cifra2NumCuenta+cifra3NumCuenta+cifra4NumCuenta+cifra5NumCuenta+cifra6NumCuenta+cifra7NumCuenta+cifra8NumCuenta+cifra9NumCuenta+cifra10NumCuenta)%11;
        digito2DC=11-digito2DC;

        if (digito2DC==10){
            digito2DC=1;
            System.out.println("El segundo dígito de DC es "+digito2DC);
        } else if (digito1DC==11){
            digito2DC=0;
            System.out.println("El segundo dígito de DC es "+digito2DC);
        } else {
            System.out.println("El segundo dígito de DC es " + digito2DC);
        }


    }//main

}//class
