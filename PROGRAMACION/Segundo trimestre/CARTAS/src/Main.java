import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Baraja baraja = new Baraja();
       /* baraja.barajar();
        jugar(baraja);*/

        JuegoNaipes juego= new JuegoNaipes();

        juego.registrarJugador("Juan", "Perez","García");
        juego.registrarJugador("Maria", "Lopez", "García");
        juego.registrarJugador("Pedro", "Garcia", "García");
        juego.registrarJugador("Ana", "Martinez", "García");


        juego.mostrarJugadores();


        juego.eliminarJugador("Pedro", "Garcia", "García");

        juego.mostrarJugadores();

        Jugador jugador = juego.getJugador("Maria", "Lopez", "García");
        System.out.println("Jugador encontrado: " + jugador.getNombre() + " " + jugador.getApellido1()+" "+jugador.getApellido2() );




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

