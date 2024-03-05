import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Empleado[] listaEmpleados;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Introduce el numero de empleados: ");
        int numEmpleados= scan.nextInt();
        if (numEmpleados < 1) {
            numEmpleados = 1;
        }
        if (numEmpleados > 20) {
            numEmpleados = 20;
        }
        listaEmpleados = new Empleado[numEmpleados];

        anadirEmpleados();

        System.out.println("Introduce el valor de las horas extra");
        float valorHorasExtra = scan.nextFloat();
        Empleado.setImporteHora(valorHorasExtra);

        imprimirEmpleados();
        System.out.println();
        empleadoQueMasCobra();
        empleadoQueMenosCobra();
        empleadoMayorSueldoConHorasExtra();
        empleadoMenorSueldoConHorasExtra();
        ordenarEmpleados();


    }

    private static void anadirEmpleados(){
        for (int i = 0; i < listaEmpleados.length; i++) {
            System.out.println("Introduce un nif");
            int numNif = scan.nextInt();
            Nif nif = new Nif(numNif);
            Empleado empleado = new Empleado(nif);
            empleado.setHorasExtras((int)(Math.random() * 20));
            empleado.setSueldoBase((int)(Math.random() * (2000 - 1000) + 1000));
            listaEmpleados[i] = empleado;
        }
    }

    private static void imprimirEmpleados() {
        for (int i = 0; i < listaEmpleados.length; i++) {
            System.out.println(listaEmpleados[i]);
        }
    }

    private static void empleadoQueMasCobra() {
        Empleado empleado = listaEmpleados[0];
        for (int i = 1; i < listaEmpleados.length; i++) {
            if (empleado.getSueldoBase() < listaEmpleados[i].getSueldoBase()) {
                empleado = listaEmpleados[i];
            }
        }

        System.out.println("El empleado con mayor sueldo es: " + empleado);
    }

    private static void empleadoQueMenosCobra() {
        Empleado empleado = listaEmpleados[0];
        for (int i = 1; i < listaEmpleados.length; i++) {
            if (empleado.getSueldoBase() > listaEmpleados[i].getSueldoBase()) {
                empleado = listaEmpleados[i];
            }
        }

        System.out.println("El empleado con menor sueldo es: " + empleado);
    }

    private static void empleadoMayorSueldoConHorasExtra() {
        Empleado empleado = listaEmpleados[0];
        for (int i = 1; i < listaEmpleados.length; i++) {
            if (empleado.calcularSueldoBruto() < listaEmpleados[i].calcularSueldoBruto()) {
                empleado = listaEmpleados[i];
            }
        }
        System.out.println("El empleado con mayor sueldo bruto es: " + empleado);
    }

    private static void empleadoMenorSueldoConHorasExtra() {
        Empleado empleado = listaEmpleados[0];
        for (int i = 1; i < listaEmpleados.length; i++) {
            if (empleado.calcularSueldoBruto() > listaEmpleados[i].calcularSueldoBruto()) {
                empleado = listaEmpleados[i];
            }
        }
        System.out.println("El empleado con menor sueldo bruto es: " + empleado);
    }


    private static void ordenarEmpleados() {
        Arrays.sort(listaEmpleados);
        imprimirEmpleados();
    }


}
