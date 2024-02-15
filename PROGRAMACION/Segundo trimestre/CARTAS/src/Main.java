import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Baraja baraja = new Baraja();
        baraja.barajar();
        jugar(baraja);
    }

    public static void jugar(Baraja baraja) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        do {
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Mostrar cartas disponibles.");
            System.out.println("2. Pedir una carta.");
            System.out.println("3. Pedir varias cartas.");
            System.out.println("4. Mostrar baraja.");
            System.out.println("5. Mostrar monton.");
            System.out.println("Cualquier otro. Salir.");

            int eleccion = scan.nextInt();
            switch (eleccion) {
                case 1:
                    baraja.mostrarCartasDisponibles();break;
                case 2:
                    baraja.darUnaCarta();break;
                case 3:
                    System.out.println("Introduce un numero de cartas: ");
                    int numCartas = scan.nextInt();
                    baraja.darVariasCartas(numCartas);break;
                case 4:
                    baraja.mostrarBaraja();break;
                case 5:
                    baraja.mostrarMonton();break;
                default:
                    System.out.println("Fin del programa");
                    continuar = false;break;
            }
        } while (continuar);
    }




}

