public class Pulpo extends Invertebrado{
    public Pulpo(float alto, float ancho, float largo, int celulas) {
        super(alto, ancho, largo, celulas);
    }

    public void camuflarse(){
        System.out.println("Se está camuflando");
    }
}
