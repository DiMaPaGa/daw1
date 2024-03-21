public class Humano extends Vertebrado{
    public Humano(float alto, float ancho, float largo, int celulas, int vertebras) {
        super(alto, ancho, largo, celulas, vertebras);
    }

    public void hablar(){
        System.out.println("Está hablando");
    }
}
