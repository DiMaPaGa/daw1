public class Videojuego {

    //atributos

    private String nombre;
    private String plataforma;
    private String genero;
    private float precio;
    private Personaje[] personajes;
    private int indice;

    //constructores

    private Videojuego(){
        this.nombre=" ";
        this.plataforma=" ";
        this.genero=" ";
        this.precio=1;
        this.indice=0;
        Personaje[] personajes= new Personaje[20];

    }
    public Videojuego(String nombre, String plataforma, String genero, float precio) throws Exception{
        this();
        setNombre(nombre);
        setPlataforma(plataforma);
        setGenero(genero);
        setPrecio(precio);

    }

    //getters y setters

    public void setNombre(String nombre) throws Exception {
        if (nombre != null && nombre != "") {
            this.nombre = nombre;
        } else {
            throw new Exception("Nombre no válido");

        }
    }


    public void setPlataforma(String plataforma) throws Exception {
        if (plataforma != null && plataforma != "") {
            this.plataforma = plataforma;
        } else {
            throw new Exception("Plataforma no válida");

        }
    }

    public void setGenero(String genero) throws Exception {
        if (genero != null && genero != "") {
            this.genero = genero;
        } else {
            throw new Exception("Plataforma no válida");

        }
    }

    public void setPrecio(float precio) throws Exception {
        if (precio > 0) {
            this.precio = precio;
        } else {
            throw new Exception("Precio no válido");
        }
    }

    public void setPersonajes(Personaje[] personajes) {
        this.personajes = personajes;
    }


    public String getNombre() {
        return nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public float getPrecio() {
        return precio;
    }

    public Personaje[] getPersonajes() {
        return personajes;
    }

    public int getIndice() {
        return indice;
    }

    //métodos

    public void anadirPersonaje (Personaje personaje){

        if(indice==personajes.length){
            System.out.println("No hay espacio para añadir este personaje");
        } else {
            if(buscarPersonaje(personaje.getIdentificador())){
                System.out.println("El personaje ya está añadido");
            } else {
                personajes[this.indice]=personaje;
                this.indice++;
                System.out.println("Personaje añadido");;
            }
        }
    }

    public boolean buscarPersonaje (int identificador){

        for (int i = 0; i < personajes.length; i++) {

            if (personajes[i] != null && personajes[i].getIdentificador()==identificador){
                return true;
            }
        }
        System.out.println("Libro no encontrado");
        return false;
    }

    public void eliminarPersonaje (int identificador) {
        boolean eliminado=false;
        if(buscarPersonaje(identificador)){
            for (int i = 0; i < personajes.length-1; i++) {
                if(personajes[i]!=null && personajes[i].getIdentificador()==identificador){
                    eliminado=true;
                }
                if(eliminado){
                    personajes[i]=personajes[i+1];
                }
            }
            if(eliminado){
                indice--;
                System.out.println("El peersonaje ha sido eliminado correctamente");
            } else{
                System.out.println("El personaje no ha sido encontrado");
            }

        }


    }

    @Override
    public String toString() {
        return  nombre + '\'' +
                plataforma + " - " + genero + '\'' +
                precio + "€";

    }
}
