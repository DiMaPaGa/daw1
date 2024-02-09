import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lectura=new Scanner(System.in);
        Scanner scan=new Scanner(System.in);


        System.out.println("introduce Nombre");
        String nombre= lectura.next();
        System.out.println("introduce edad");
        int edad= scan.nextInt();
        System.out.println("introduce sexo");
        char sexo=scan.next().charAt(0);
        System.out.println("introduce peso en KG");
        float peso= scan.nextFloat();
        System.out.println("introduce altura en Metros");
        float altura= scan.nextFloat();


        Persona persona1=new Persona(nombre, edad, sexo, peso,altura);
        Persona persona2=new Persona(nombre, edad, sexo);
        Persona persona3= new Persona();


        System.out.println("\nPersona 1:");
        System.out.println(persona1);
        pesoIdeal(persona1.calcularIMC(peso, altura));
        System.out.println("¿Es mayor de edad? "+persona1.esMayorEdad());

        System.out.println("\nPersona 2:");
        System.out.println(persona2);
        pesoIdeal(persona2.calcularIMC(peso, altura));
        System.out.println("¿Es mayor de edad? "+persona2.esMayorEdad());

        System.out.println("\nPersona 3:");
        persona3.setNombre("Maria");
        persona3.setEdad(65);
        persona3.setSexo('M');
        persona3.setPeso(50f);
        persona3.setAltura(1.62f);
        System.out.println(persona3);
        pesoIdeal(persona3.calcularIMC(peso, altura));
        System.out.println("¿Es mayor de edad? "+persona3.esMayorEdad());


    }

    private static void pesoIdeal (int valor){

        switch (valor){

            case 1:
                System.out.println("Tiene sobrepeso");
                break;
            case 0:
                System.out.println("Está en su peso ideal");
                break;
            case -1:
                System.out.println("Está por debajo de su peso ideal");
                break;
            default:
                System.out.println("Hay un error");
                break;

        }



    }



}