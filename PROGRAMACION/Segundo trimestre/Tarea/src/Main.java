public class Main {
    public static void main(String[] args) {

        Tarea tarea1=new Tarea("Lavar ropa", "Ponerla en la lavadora");
        Tarea tarea2=new Tarea("Tender ropa", "Ponerla en el tendedero");
        Tarea tarea3=new Tarea("Recoger ropa", "Recogerla del tendedero");
        Tarea tarea4=new Tarea("Doblar ropa", "Doblarla adecuadamente");
        Tarea tarea5=new Tarea("Guardar ropa", "guardarla en sus respectivos lugares");

        Tarea [] tarea={tarea1, tarea2, tarea3, tarea4, tarea5};

        imprimirLista(tarea);


        System.out.println(tarea1.marcarComoCompletada());

        imprimirLista(tarea);







    }

    public static void imprimirLista (Tarea[] tarea){
        for (int i = 0; i < tarea.length; i++) {
            System.out.println(tarea[i]);

        }

    }




}
