public class Triangulo extends Poligono{

    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        super(3);
        this.base=base;
        this.altura=altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        if(base>0){
            this.base = base;
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura>0){
            this.altura = altura;
        }

    }

    @Override
    public float calcularArea() {

        return (base*altura)/2 ;
    }

}
