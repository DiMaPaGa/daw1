public class Main {
    public static void main(String[] args) {

        CCC cuenta1= new CCC("Diana", 2000);
        CCC cuenta2= new CCC("Moises",2500);

        System.out.println(cuenta1.getDatosGenerales());
        System.out.println(cuenta2.getDatosGenerales());


        cuenta2.realizarTrasferenciasEntreCuentas(500, cuenta1);


        System.out.println(cuenta1.getDatosGenerales());
        System.out.println(cuenta2.getDatosGenerales());


    }
}