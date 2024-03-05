import java.util.Scanner;

public class Nif {


    private int numDni;
    private char letraDni;


    private Nif() {
        this.numDni = -1;
        this.letraDni = ' ';
    }

    public Nif(int numDni) {
        this();
        this.numDni = numDni;
        this.letraDni = generarLetra(numDni);
    }

    private static char generarLetra(int numDni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int posLetra = numDni % 23;

        return letras.charAt(posLetra);
    }

    @Override
    public String toString() {
        return this.numDni + "-" + this.letraDni;
    }


    public static void leerDni() {
        Scanner scan = new Scanner(System.in);
        int numDni = scan.nextInt();
        System.out.println(generarLetra(numDni));
        
    }

}

