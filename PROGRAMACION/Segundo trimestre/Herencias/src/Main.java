public class Main {
    public static void main (String [] args){
    Rectangulo rect=new Rectangulo();
    Triangulo triang= new Triangulo();

    rect.set_values(4,5);
    triang.set_values(4,5);

     /*   System.out.println("Area Rectangulo:"+ rect.area());
        System.out.println("Area Rectangulo:"+ triang.area());*/

        Alumno alumno=new Alumno("Carlos", 36, 15, "Profesor");

        System.out.println(alumno);

        Persona p =new Alumno("Julio", 34, 11, "Profesor");

        Alumno a= new Alumno("Julio", 34, 11, "Profesor");

        //p=a;

       // a.setEdad(35);
//System.out.println(p); //el cambio de la edad no lo va a coger la persona.

        //Profesor l =new Profesor("Laura", 26, "Profesor");

      //  System.out.println(a);
        //System.out.println(l);

        Persona[] listaPersonas =new Persona[5];

        for (int i = 0; i < listaPersonas.length ; i++) {
            if(i%2==0){
                listaPersonas[i]=new Alumno("Carlos",i+4, i+10, "estudiante");
            } else {
                listaPersonas[i]= new Profesor("Jesus",i+10, "programacion");
            }

        }

        for (int i = 0; i < listaPersonas.length; i++) {
            System.out.println(listaPersonas[i]);
        }








}
}