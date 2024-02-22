import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      /*  Persona persona1= new Persona("María", "Torres", 65);
        Persona persona2= new Persona("Ana", "Pascual", 15);
        Persona persona3= new Persona("Eva", "García", 25);
        Persona persona4= new Persona("Zayda", "Nogales", 45);


        Persona [] personas={persona1, persona2, persona3, persona4};

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);

        }

        Arrays.sort(personas);
        System.out.println();

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);

        }*/

        Contador contConValor= new Contador(20);
        Contador contSinValor= new Contador();
        Contador contConValorInvalido= new Contador(-20);

        System.out.println(contConValor.getCont());
        System.out.println(contSinValor.getCont());
        System.out.println(contConValorInvalido.getCont());

        /*contSinValor.incrementar();
        contConValor.decrementar();
        contConValorInvalido.setCont(-20);*/

        contSinValor.decrementar();


        System.out.println(contConValor.getCont());
        System.out.println(contSinValor.getCont());
        System.out.println(contConValorInvalido.getCont());
    }






}