public class Main {
    public static void main(String[] args) {

    Persona diana= new Persona();
    Persona moi= new Persona("Moises", 39,"hombre");
    Persona chio=new Persona("ana", 39, "mujer", 51, 149);

   /*diana.nombre= "Diana";
        System.out.println(diana.nombre);

        moi.nombre= "Nando";

        System.out.println(moi.nombre);
        moi.nombre="Moi";

        System.out.println(moi.peso);

        System.out.println(diana.peso);
        System.out.println(moi.peso);
        System.out.println(chio.peso);*/

        diana.setNombre("Diadre");
        System.out.println(diana.getNombre());

        System.out.println(diana);
        System.out.println(moi);

        //como las variables normalmente son privadas, utilizamos getters y setters




    }
}