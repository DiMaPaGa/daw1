import java.util.Scanner;

public class DianaMariaPascualGarcia {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);


     // EJERCICIO 1

        int variable1;
        int variable2;

        System.out.println("Ingrese un número");
        variable1= scan.nextInt();
        System.out.println("Ingrese otro número");
        variable2= scan.nextInt();
    if (variable1!=variable2){
        if(variable1<variable2){
            int contenedor=variable2;
            variable2=variable1;
            variable1=contenedor;
        }
        System.out.println("La variable1 vale ahora " + variable1 + " y variable2 vale " + variable2);
    } else{
        System.out.println("Ambas cantidades de variable1 y variable2 son iguales= "+ variable1);
    }

    //EJERCICIO 2
        String nombre= " ";
        String apellido=" ";
        float nota=0f; //Elijo float porque las calificaciones pueden contener decimales.
        int seleccion= 1;
        int contador=0;
        float sumaNotas=0f;

        do {
            System.out.println("Nombre del alumno/a");
            nombre= scan.next();
            System.out.println("Apellido del alumno/a");
            apellido= scan.next();
            System.out.println("Calificación");
            nota= scan.nextFloat();

            while (nota <0 || nota >10){
                System.out.println("Ingrese un número entre 0 y 10");
                nota= scan.nextInt();
            }
                contador ++;
                sumaNotas+=nota;

            System.out.println("El estudiante "+ nombre+ " "+ apellido +" tiene una calificación de "+ nota );

            System.out.println("¿Desea ingresar las calificaciones de otro estudiante? responda 1 si es SI o 2 si es NO");
            seleccion= scan.nextInt();
            if (seleccion<1 || seleccion>2){
                System.out.println("El valor introducido no es válido, recuerde 1 para si o 2 para no");
                seleccion= scan.nextInt();
            }

        } while (seleccion==1);

        System.out.println("El número de alumnos introducidos en el sistema son "+ contador + " y su promedio de calificaciones es "+ sumaNotas/contador);

        //EJERCICIO 3

        int contCalen=1;

        System.out.println("Ingresa el número del mes que desee visualizar (del 1 al 12)");
        int mes= scan.nextInt();
        while (mes<1 || mes>12){
            System.out.println("Recuerde, introduzca un numero de mes del 1 al 12");
            mes= scan.nextInt();
        }
        switch (mes){
            case 1:
                System.out.println("        "+"''"+ "Enero"+"''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i<=31 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=31){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }

                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("        "+"''"+"Febrero"+"''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i <=28 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=28){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }


                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("        "+ "''"+ "Marzo"+ "''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i <=31 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=31){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }


                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("        "+ "''"+ "Abril"+ "''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i <=30 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=30){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }


                    }
                    System.out.println();
                }
                break;
            case 5:
                System.out.println("        "+ "''"+ "Mayo"+ "''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i <=31 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=31){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }


                    }
                    System.out.println();
                }
                break;
            case 6:
                System.out.println("        "+ "''"+ "Junio"+"''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i <=30 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=30){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }


                    }
                    System.out.println();
                }
                break;
            case 7:
                System.out.println("        "+"''"+ "Julio"+"''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i <=31 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=31){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }


                    }
                    System.out.println();
                }
                break;
            case 8:
                System.out.println("        "+ "''"+"Agosto"+"''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i <=31 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=31){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }


                    }
                    System.out.println();
                }
                break;
            case 9:
                System.out.println("        "+"''"+ "Septiembre"+"''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i <=30 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=30){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }


                    }
                    System.out.println();
                }
                break;
            case 10:
                System.out.println("        "+"''"+ "Octubre"+"''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i <=31 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=31){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }


                    }
                    System.out.println();
                }
                break;
            case 11:
                System.out.println("        "+"''"+ "Noviembre"+"''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i <=30 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=30){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }

                    }
                    System.out.println();
                }
                break;
            case 12:
                System.out.println("        "+"''"+ "Diciembre"+"''");
                System.out.println("Lu"+ " Ma"+ " Mi"+ " Ju"+ " Vi"+ " Sa"+ " Do");
                for (int i = 1; i <=31 ; i++) {
                    for (int j = 1; j <=7 ; j++) {

                        if(contCalen>=1 && contCalen<10){
                            System.out.print("0"+contCalen+" ");
                            contCalen++;
                        } else if (contCalen>=10 && contCalen<=31){
                            System.out.print(contCalen+" ");
                            contCalen++;
                        }


                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Valor no válido");
                break;


        }








    }

}
