public class Main {
    public static void main(String[] args) throws Exception {

        Superheroe superheroe1 = new Superheroe("Batman");
        superheroe1.setDescripcion("Hombre murciélago");
        superheroe1.setCapa(true);
        Superheroe superheroe2=new Superheroe("Bruja Escarlata");
        superheroe2.setDescripcion("Mutante de Marvel hija de Magneto");
        superheroe2.setCapa(true);
        Superheroe superheroe3=new Superheroe("Magneto");
        superheroe2.setDescripcion("Mutante de Marvel padre Bruja Escalata");
        superheroe2.setCapa(false);
        Superheroe superheroe4=new Superheroe("Lobezno");
        superheroe2.setDescripcion("Mutante de Marvel");
        superheroe2.setCapa(false);

        // Crear una dimensión
        Dimension dimension1 = new Dimension(10, 5, 3);

        // Crear una figura
        Figura figura1 = new Figura("001B", 25.0, dimension1, superheroe1);
        Figura figura2 = new Figura("001m", 45.0, dimension1, superheroe2);
        Figura figura3 = new Figura("002m", 40.0, dimension1, superheroe3);
        Figura figura4 = new Figura("003m", 40.0, dimension1, superheroe4);

        // Crear una colección
        Coleccion coleccion = new Coleccion("Mutantes");
        coleccion.anadirFigura(figura1);
        coleccion.anadirFigura(figura2);
        coleccion.anadirFigura(figura3);
        coleccion.anadirFigura(figura4);

        // Imprimir información de la colección
        System.out.println(coleccion.toString());
        System.out.println("Valor total de la colección: " + coleccion.getValorColeccion());
        System.out.println("Volumen total de la colección: " + coleccion.getVolumenColeccion());

    }
}