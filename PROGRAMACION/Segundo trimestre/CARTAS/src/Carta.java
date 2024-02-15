public class Carta {

    private String palo;
    private int numero;


    public Carta(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        String impresion = " _______ \n";
        switch (numero) {
            case 1:
                impresion += "| A |\n";break;
            case 10:
                impresion += "| J |\n";break;
            case 11:
                impresion += "| Q |\n";break;
            case 12:
                impresion += "| K |\n";break;
            default:
                impresion += "| " + numero + " |\n";break;
        }
        impresion += "| |\n";
        switch (palo) {
            case "Diamantes":
                impresion += "| <> |\n"; break;
            case "Corazones":
                impresion += "| <3 |\n";break;
            case "Picas":
                impresion += "| {> |\n";break;
            case "Treboles":
                impresion += "| -% |\n";break;
            default:
                break;
        }
        impresion += "|_______|";

        return impresion;
    }
}
