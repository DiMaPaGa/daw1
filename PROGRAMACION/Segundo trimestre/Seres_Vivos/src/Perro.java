public class Perro extends Vertebrado{


    public Perro(float alto, float ancho, float largo, int celulas, int vertebras) {
        super(alto, ancho, largo, celulas, vertebras);
    }

    public void ladrar(){
            System.out.println("Está ladrando");
        }
}
