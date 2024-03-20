public class Triangulo extends Rectangulo{
    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {

        return (base*altura)/2 ;
    }

}
