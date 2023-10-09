public class ClaseCondicionales {

    public static void main (String [] args){
       int edadJorge=31;
       int edadPaco=12;
       if(edadJorge>edadPaco){
           System.out.println("El contenido del IF se ejecuta");
           if (edadJorge>0){
               System.out.println("a mayor de 0");
           }

       }
        if(edadJorge<edadPaco){
            System.out.println("El contenido del IF NO  se ejecuta");

        }
        System.out.println("FIN");

        if (edadJorge>edadPaco){
            System.out.println("Jorge es mayor que Paco");
        } else{
            System.out.println("Jorge es IGUAL O MENOR que Paco");

        }
//cascada de If else...
        if (edadJorge>edadPaco){
            System.out.println("Jorge es mayor que Paco");
        } else if (edadJorge==edadPaco){
            System.out.println("Ambos tienen la misma edad");

        } else{
            System.out.println("Jorge es menor que Paco"); //siempre poner else, aunque tenga que indicar un mensaje de que es imposible.
        }



    }//main
}//class
