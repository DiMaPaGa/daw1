import java.util.Scanner;

public class EjercicioNavidadModos {

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        int modo = 0;
        int iPosT = 1;
        int jPosT = 1;
        int iPosH = 18;
        int jPosH = 18;
        boolean fin = false;
        String direccion = "";

        do {
            System.out.println("Elija modo de juego");
            System.out.println("1. Modo Fácil");
            System.out.println("2. Modo Complicado");
            modo = scan1.nextInt();
        } while (modo != 1 && modo != 2);

        switch (modo) {
            case 1:
                System.out.println("Ha elegido el modo fácil");
                break;

            case 2:
                System.out.println("Ha elegido el modo difícil");
                break;

            default:
                System.out.println("No es posible");
                break;
        }

        while (!fin) {
            if (modo == 1) {

                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (j == 0 || i == 0 || j == 19 || i == 19) {
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
            } else {
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (j == 0 || i == 0 || j == 19 || i == 19) {
                            System.out.print("* ");
                        } else {
                            if (i == iPosT && j == jPosT) {
                                System.out.print("T ");
                            } else if (i == iPosH && j == jPosH) {
                                System.out.print("H ");
                            } else if (i == 10 && ((j > 0 && j < 5) || (j > 6 && j < 15) || (j > 16))) {

                                System.out.print("+ ");
                            } else if (j == 10 && ((i > 0 && i < 5) || (i > 6 && i < 15) || (i > 16))) {
                                System.out.print("+ ");

                            } else {
                                System.out.print("  ");
                            }
                        }
                    }
                    System.out.println();
                }
            }


                do {
                    System.out.println("¿Siguiente paso?");
                    System.out.println("N = paso arriba, S = paso abajo, O = paso izquierda y E = paso derecha o STOP= ¡Timmy para!");
                    direccion = scan2.nextLine().toLowerCase();
                } while (!direccion.equals("n") && !direccion.equals("s") && !direccion.equals("e") && !direccion.equals("o") && !direccion.equals("stop"));

                switch (direccion) {
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
                        fin = true;
                        break;

                    default:
                        System.out.println("No es posible");
                        break;
                }

            if (modo == 2 && (iPosT == 10 && (jPosT > 0 && jPosT < 5 || jPosT > 6 && jPosT < 15 || jPosT > 16) ||
                    (jPosT == 10 && (iPosT > 0 && iPosT < 5 || iPosT > 6 && iPosT < 15 || iPosT > 16)))) {
                System.out.println("Noooo, Timmy ha caído en una trampa. Se acabó el juego");
                fin = true;
            }

                if (iPosT == 0 || iPosT == 19 || jPosT == 0 || jPosT == 19) {
                    System.out.println("Noooo, Timmy ha caído en una trampa. Se acabó el juego");
                    fin = true;
                }

                if (iPosT == iPosH && jPosT == jPosH) {
                    System.out.println("¡¡Timmy ha escapado!!");
                    fin = true;
                }

        }
    }
}





