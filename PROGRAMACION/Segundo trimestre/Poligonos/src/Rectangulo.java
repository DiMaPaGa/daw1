public class Rectangulo extends Poligono {

    protected float base;
    protected float altura;


    public Rectangulo(float base, float altura){
        super(4);
        this.base=base;
        this.altura=altura;


    }
    public Rectangulo(float base){
        super(4);
        this.base=base;
        this.altura=base;


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

        return this.base*this.altura;
    }
}
