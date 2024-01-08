import java.util.Scanner;

public class EjercicioNavidad {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);


       int iPosT=1;
       int jPosT=1;
       int iPosH=18;
       int jPosH=18;
       boolean fin =false;


       while (!fin){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (j==0 || i==0 || j==19 || i==19){
                    System.out.print("* ");
                } else {
                    if (i == iPosT && j == jPosT) {
                        System.out.print("T ");
                    } else if (i == iPosH && j == jPosH) {
                        System.out.print("H ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

        String direccion="";

        do {
            System.out.println("¿Siguiente paso?");
            System.out.println("N = paso arriba, S = paso abajo, O = paso izquierda y E = paso derecha o STOP= ¡Timmy para!");
            direccion= scan.nextLine().toLowerCase();
        } while (!direccion.equals("n")&&!direccion.equals("s")&&!direccion.equals("e")&&!direccion.equals("o")&&!direccion.equals("stop"));

        switch (direccion){
            case "n":
                iPosT--;
                break;

            case "s":
                iPosT++;
                break;

            case "o":
                jPosT--;
                break;

            case "e":
                jPosT++;
                break;

            case "stop":
                System.out.println("el juego ha terminado");
                fin=true;
                break;

            default:
                System.out.println("No es posible");
                break;
        }

        if (iPosT==0 || iPosT==19 || jPosT==0 || jPosT==19){
            System.out.println("Noooo, Timmy ha caído en una trampa. Se acabó el juego");
            fin=true;
        }

        if (iPosT==iPosH && jPosT==jPosH){
            System.out.println("¡¡Timmy ha escapado!!");
            fin=true;
        }

       }





        }


    }
