import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        try{
            Libro libro1= new Libro("123456789009", "20000 leguas de viaje Submarino", "Julio Verne", 40, "Tauro");

            Libro libro2= new Libro("123789009", "20000 leguas de viaje Submarino", "Julio Verne");

            Libro libro3= new Libro("123789009", "20000 leguas de viaje Submarino", "4");



        } catch (NullPointerException | IllegalArgumentException | InputMismatchException e) {
            System.err.println("Error " + e.getMessage());
        }






    }
}