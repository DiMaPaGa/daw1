import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int tamanyoArray=0;
        do{
            System.out.println("Ingrese un tamaño del array: ");
            tamanyoArray= scan.nextInt();
        } while (tamanyoArray <= 0);

        int longitud=0;
        do{
        System.out.println("Ingrese la longitud de la contraseña: ");
        longitud= scan.nextInt();
        } while (longitud <= 0);

        Password[] arrayPasswords= new Password[tamanyoArray];
        boolean[] arrayBooleans= new boolean[tamanyoArray];

        for (int i = 0; i < tamanyoArray; i++) {
            arrayPasswords[i]= new Password(longitud);
            arrayBooleans[i]= arrayPasswords[i].esFuerte();
            System.out.println("Contraseña"+(i+1)+" "+arrayPasswords[i].getContrasenia()+ "_"+arrayBooleans[i]);
        }








    }


}
