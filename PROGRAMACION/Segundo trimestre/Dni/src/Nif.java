import java.util.Scanner;

public class Nif {


    private int dni;
    private char letra;

    private Nif(){ //si hay otro constructor que recibe, este privado y evitamos que se inicialice por error en el main
     this.dni=0;
     this.letra=' ';
    }

    public Nif(int dni){
        this();
        this.dni=dni;
        this.letra=generarLetra(dni);

    }

   public static void leer() {//pertenece a la clase y no al objeto
       Scanner scan=new Scanner(System.in);
        System.out.println("Incorpore su número de dni");
            int dni = scan.nextInt();
       System.out.println(generarLetra(dni));

    }

    private static char generarLetra(int dni) {
        String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
        int posicion= dni%23;

        return letras.charAt(posicion);

    }

   public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }


    @Override
    public String toString() {
        return dni + "-" + letra;
    }
}


