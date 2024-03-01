import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Nif nif1=new Nif(30229753);
        Nif nif2=new Nif (30229754);


        System.out.println(nif1.toString());
        System.out.println(nif2.toString());

        Scanner scan= new Scanner(System.in);
        Scanner lectura= new Scanner(System.in);
        Scanner bool= new Scanner(System.in);

        System.out.println("¿De cuántos empleados dispone?");
        int numEmpleados= scan.nextInt();
        Empleado[] empleados= new Empleado[numEmpleados];
        for (int i = 0; i < empleados.length ; i++) {
            System.out.println("Introduzca nif de empleado, sin letra");
            empleados[i]=new Empleado(new Nif(scan.nextInt()));

            System.out.println("Introduzca nombre");
            empleados[i].setNombre(lectura.nextLine());

            System.out.println("Introduzca apellidos");
            empleados[i].setApellido(lectura.nextLine());

            System.out.println("¿Está casado/a? Indique true o false");
            empleados[i].setEstaCasado(bool.nextBoolean());
            System.out.println("Número de hijos");
            empleados[i].setHijos(scan.nextInt());
            System.out.println("Salario base");
            empleados[i].setSueldoBase(scan.nextFloat());
            System.out.println("Horas extras");
            empleados[i].setHorasExtras(scan.nextInt());

        }
        System.out.println("¿Cúando es el importe de la hora extra?");
       Empleado.setImporteHora(scan.nextFloat());

        imprimirArray(empleados);

       empleadoMasCobra(empleados);
       empleadoMenosCobra(empleados);
       empleadoMasCobraXHE(empleados);
       empleadoMenosCobraXHE(empleados);






    }


    public static void empleadoMasCobra(Empleado[]empleados){
        ordenarXSueldoBruto(empleados);

        System.out.println("El empleado que más cobra es: "+ empleados[empleados.length-1]);

    }

    public static void empleadoMenosCobra(Empleado[]empleados){
        ordenarXSueldoBruto(empleados);

        System.out.println("El empleado que menos cobra es: "+ empleados[0]);


    }


    public static void empleadoMasCobraXHE(Empleado[]empleados){
        ordenarXSalario(empleados);

        System.out.println("El empleado que mas cobra con horas extras es: "+ empleados[empleados.length-1]);

    }
    public static void empleadoMenosCobraXHE(Empleado[]empleados){
        ordenarXSalario(empleados);

        System.out.println("El empleado que menos cobra con horas extras es: "+ empleados[0]);


    }

    private static void ordenarXSalario (Empleado[] empleados){
            for (int i = 0; i <empleados.length-1 ; i++) {
                for (int j = 0; j < (empleados.length-1)-i; j++) {
                    if (empleados[j].calcularSueldoBruto()> empleados[j + 1].calcularSueldoBruto()) {
                        Empleado mayor = empleados[j];
                        empleados[j] = empleados[j + 1];
                        empleados[j + 1] = mayor;
                    }

                }
            }

    }

    private static void ordenarXSueldoBruto (Empleado[] empleados){
        for (int i = 0; i <empleados.length-1 ; i++) {
            for (int j = 0; j < (empleados.length-1)-i; j++) {
                if (empleados[j].getSueldoBase()> empleados[j + 1].getSueldoBase()) {
                    Empleado mayor = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = mayor;
                }

            }
        }

    }

    public static void imprimirArray(Empleado[] empleados){
        for (Empleado elemento: empleados) {
            System.out.println(elemento.toString());
            System.out.println();
        }
    }




}