public class Baraja {

    private final Carta[] baraja;
    private final Carta[] monton;
    private int cartasDisponibles;


    public Baraja() {
        this.baraja = new Carta[48];
        this.monton = new Carta[48];
        this.cartasDisponibles = 48;
        rellenarBaraja();
    }

    private void rellenarBaraja() {
        String[] palos = {"Picas", "Treboles", "Corazones", "Diamantes"};
        int indice = 0;

        for (int i = 0; i < palos.length; i++) {
            for (int j = 1; j <= 12; j++) {
                Carta carta = new Carta(palos[i], j);
                baraja[indice] = carta;
                indice++;
            }
        }
    }

    public void mostrarBaraja() {
        for (Carta carta:this.baraja) {
            if (carta != null) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarMonton() {
        for (Carta carta:this.monton) {
            if (carta != null) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarCartasDisponibles() {
        System.out.println("El numero de cartas disponibles es " + cartasDisponibles);
    }

    public void barajar() {
        int posAleatoria;
        for (int i = 0; i < baraja.length; i++) {
            posAleatoria = (int)(Math.random()*baraja.length);
            Carta cartaTemporal = baraja[i];
            baraja[i] = baraja[posAleatoria];
            baraja[posAleatoria] = cartaTemporal;
        }
    }

    public void darUnaCarta() throws Exception {
        if (cartasDisponibles == 0) {
            throw new Exception("No hay mas cartas");
        }
        cartasDisponibles--;
        int indice = 47 - cartasDisponibles;
        monton[indice] = baraja[indice];

        System.out.println(baraja[indice]);
    }

    public void darVariasCartas(int numCartas) throws Exception {
        if (numCartas > cartasDisponibles) {
            throw new Exception("No hay mas cartas");
        }
        Carta[] cartasARepartir = new Carta[numCartas];
        for (int i = 0; i < numCartas; i++) {
            cartasARepartir[i] = sacarCarta();
            System.out.println(cartasARepartir[i]);
        }
    }

    public Carta sacarCarta() throws Exception {
        if (cartasDisponibles == 0) {
            throw new Exception("No hay mas cartas");
        }
        cartasDisponibles--;
        int indice = 47 - cartasDisponibles;
        monton[indice] = baraja[indice];

        return baraja[indice];
    }
}
