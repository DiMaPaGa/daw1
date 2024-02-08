public class Main {
    public static void main(String[] args) {

        CCC ccc_1= new CCC("Diana", 2000);
        CCC ccc_2= new CCC("Moises",2500);

        System.out.println(ccc_1.getDatosGenerales());
        System.out.println(ccc_1.getSaldoDeCuenta());
        System.out.println(ccc_2.getDatosGenerales());
        System.out.println(ccc_2.getSaldoDeCuenta());


        ccc_1.realizarTrasferenciasEntreCuentas(500, ccc_2);


        System.out.println(ccc_1.getDatosGenerales());
        System.out.println(ccc_2.getDatosGenerales());
        System.out.println(ccc_1.getSaldoDeCuenta());
        System.out.println(ccc_2.getSaldoDeCuenta());


    }
}