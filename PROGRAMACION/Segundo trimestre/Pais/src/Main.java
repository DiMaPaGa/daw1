import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

     Pais espana=new Pais("Espana", 40500000,55000485.50);


     System.out.println(espana.pibPerCapita());

     Proyecto proyect1 = new Proyecto("Sobre Postman", 4, 120);

        System.out.println(proyect1.calculoSalario());





    }
}
